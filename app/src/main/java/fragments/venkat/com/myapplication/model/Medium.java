package fragments.venkat.com.myapplication.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by venkatgonuguntala on 8/11/16.
 */
public class Medium {

    @JsonProperty("type")
    private String type;
    @JsonProperty("subtype")
    private String subtype;
    @JsonProperty("caption")
    private String caption;
    @JsonProperty("copyright")
    private String copyright;
    @JsonProperty("media-metadata")
    private List<MediaMetadatum> mediaMetadata = new ArrayList<MediaMetadatum>();

    /**
     *
     * @return
     * The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The subtype
     */
    @JsonProperty("subtype")
    public String getSubtype() {
        return subtype;
    }

    /**
     *
     * @param subtype
     * The subtype
     */
    @JsonProperty("subtype")
    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    /**
     *
     * @return
     * The caption
     */
    @JsonProperty("caption")
    public String getCaption() {
        return caption;
    }

    /**
     *
     * @param caption
     * The caption
     */
    @JsonProperty("caption")
    public void setCaption(String caption) {
        this.caption = caption;
    }

    /**
     *
     * @return
     * The copyright
     */
    @JsonProperty("copyright")
    public String getCopyright() {
        return copyright;
    }

    /**
     *
     * @param copyright
     * The copyright
     */
    @JsonProperty("copyright")
    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    /**
     *
     * @return
     * The mediaMetadata
     */
    @JsonProperty("media-metadata")
    public List<MediaMetadatum> getMediaMetadata() {
        return mediaMetadata;
    }

    /**
     *
     * @param mediaMetadata
     * The media-metadata
     */
    @JsonProperty("media-metadata")
    public void setMediaMetadata(List<MediaMetadatum> mediaMetadata) {
        this.mediaMetadata = mediaMetadata;
    }
}
