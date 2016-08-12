package fragments.venkat.com.myapplication.controller;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.squareup.okhttp.OkHttpClient;
import java.util.concurrent.TimeUnit;
import fragments.venkat.com.myapplication.api.NewYorkTimesApi;
import fragments.venkat.com.myapplication.util.Constant;
import retrofit.RestAdapter;
import retrofit.android.AndroidLog;
import retrofit.client.OkClient;
import retrofit.converter.JacksonConverter;

/**
 * Created by venkatgonuguntala on 8/11/16.
 */

public class Access {
    private static final String TAG = "Access";
    private static final int TIMEOUT = 15;

    private static Access instance;

    private OkClient okClient;
    private JacksonConverter converter;

    private NewYorkTimesApi newYorkTimesApi;

    /**
     * For thread-safe approach, double checking singleton instance.
     * @return instance
     */
    public static Access getInstance() {
        if (instance == null) {
            synchronized (Access.class) {
                // Double check
                if (instance == null) {
                    instance = new Access();
                }
            }
        }
        return (instance);
    }

    private Access() {
        // Make HTTP client
        OkHttpClient okHttpClient = new OkHttpClient();
        okHttpClient.setConnectTimeout(TIMEOUT, TimeUnit.SECONDS);
        okHttpClient.setReadTimeout(TIMEOUT, TimeUnit.SECONDS);
        okHttpClient.setFollowRedirects(false);
        okClient = new OkClient(okHttpClient);

        // Make JSON converter
        ObjectMapper mapper = new ObjectMapper();
        mapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.NONE);
        mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        converter = new JacksonConverter(mapper);
    }

    public NewYorkTimesApi getNewYorkTimesAPi() {
        if (newYorkTimesApi !=null) return(newYorkTimesApi);

        RestAdapter.Builder builder = new RestAdapter.Builder();
        builder.setClient(okClient);
        builder.setEndpoint(Constant.BASE_URL);
        builder.setConverter(converter);
        builder.setLog(new AndroidLog(TAG));
        RestAdapter adapter = builder.build();

        newYorkTimesApi = adapter.create(NewYorkTimesApi.class);
        return newYorkTimesApi;
    }
}
