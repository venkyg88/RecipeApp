package fragments.venkat.com.myapplication.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by venkatgonuguntala on 8/11/16.
 */
public class MediaMetadatum {

    @JsonProperty("url")
    private String url;
    @JsonProperty("format")
    private String format;
    @JsonProperty("height")
    private Integer height;
    @JsonProperty("width")
    private Integer width;

    /**
     *
     * @return
     * The url
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url
     * The url
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     *
     * @return
     * The format
     */
    @JsonProperty("format")
    public String getFormat() {
        return format;
    }

    /**
     *
     * @param format
     * The format
     */
    @JsonProperty("format")
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     *
     * @return
     * The height
     */
    @JsonProperty("height")
    public Integer getHeight() {
        return height;
    }

    /**
     *
     * @param height
     * The height
     */
    @JsonProperty("height")
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     *
     * @return
     * The width
     */
    @JsonProperty("width")
    public Integer getWidth() {
        return width;
    }

    /**
     *
     * @param width
     * The width
     */
    @JsonProperty("width")
    public void setWidth(Integer width) {
        this.width = width;
    }
}
