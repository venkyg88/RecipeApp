package fragments.venkat.com.myapplication.api;

import fragments.venkat.com.myapplication.model.Business;
import fragments.venkat.com.myapplication.model.Health;
import fragments.venkat.com.myapplication.model.Politics;
import fragments.venkat.com.myapplication.model.UnitedStates;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by venkatgonuguntala on 8/11/16.
 */

public interface NewYorkTimesApi {

    //http://api.nytimes.com/svc/mostpopular/v2/mostviewed/{section}/{period}.json?api-key=sample-key
    //prefered period = 7


    //http://api.nytimes.com/svc/mostpopular/v2/mostviewed/U.S./7.json?api-key=sample-key
    @GET("/svc/mostpopular/v2/mostviewed/world/7.json")
    void getUnitedStatesCategory(
            /*@Path("id") int goupId,*/
            @Query("api-key") String apiKey,
            Callback<UnitedStates> callback
    );

    //http://api.nytimes.com/svc/mostpopular/v2/mostviewed/business/7.json?api-key=896558ac243a867968c80e069833ad69:4:73884796
    @GET("/svc/mostpopular/v2/mostviewed/business/7.json")
    void getBusinessCategory(
            @Query("api-key") String apiKey,
            Callback<Business> callback
    );

    //http://api.nytimes.com/svc/mostpopular/v2/mostviewed/health/7.json?api-key=sample-key
    @GET("/svc/mostpopular/v2/mostviewed/health/7.json")
    void getHealthCategory(
            @Query("api-key") String apiKey,
            Callback<Health> callback
    );

    //http://api.nytimes.com/svc/mostpopular/v2/mostviewed/politics/7.json?api-key=sample-key
    @GET("/svc/mostpopular/v2/mostviewed/politics/7.json")
    void getPoliticsCategory(
            @Query("ai-key") String apiKey,
            Callback<Politics> callback
    );
}
