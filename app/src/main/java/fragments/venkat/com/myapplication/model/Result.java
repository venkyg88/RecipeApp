package fragments.venkat.com.myapplication.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by venkatgonuguntala on 8/11/16.
 */

public class Result {

    @JsonProperty("url")
    private String url;
    @JsonProperty("adx_keywords")
    private String adxKeywords;
    @JsonProperty("column")
    private String column;
    @JsonProperty("section")
    private String section;
    @JsonProperty("byline")
    private String byline;
    @JsonProperty("type")
    private String type;
    @JsonProperty("title")
    private String title;
    @JsonProperty("abstract")
    private String _abstract;
    @JsonProperty("published_date")
    private String publishedDate;
    @JsonProperty("source")
    private String source;
    @JsonProperty("views")
    private Integer views;
    /*@JsonProperty("des_facet")
    private List<String> desFacet = new ArrayList<String>();
    @JsonProperty("org_facet")
    private String orgFacet;
    @JsonProperty("per_facet")
    private List<String> perFacet = new ArrayList<String>();
    @JsonProperty("geo_facet")
    private List<String> geoFacet = new ArrayList<String>();
    @JsonProperty("media")
    private List<Medium> media = new ArrayList<Medium>();*/

    /**
     * @return The url
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * @param url The url
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return The adxKeywords
     */
    @JsonProperty("adx_keywords")
    public String getAdxKeywords() {
        return adxKeywords;
    }

    /**
     * @param adxKeywords The adx_keywords
     */
    @JsonProperty("adx_keywords")
    public void setAdxKeywords(String adxKeywords) {
        this.adxKeywords = adxKeywords;
    }

    /**
     * @return The column
     */
    @JsonProperty("column")
    public String getColumn() {
        return column;
    }

    /**
     * @param column The column
     */
    @JsonProperty("column")
    public void setColumn(String column) {
        this.column = column;
    }

    /**
     * @return The section
     */
    @JsonProperty("section")
    public String getSection() {
        return section;
    }

    /**
     * @param section The section
     */
    @JsonProperty("section")
    public void setSection(String section) {
        this.section = section;
    }

    /**
     * @return The byline
     */
    @JsonProperty("byline")
    public String getByline() {
        return byline;
    }

    /**
     * @param byline The byline
     */
    @JsonProperty("byline")
    public void setByline(String byline) {
        this.byline = byline;
    }

    /**
     * @return The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * @param type The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return The title
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * @param title The title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return The _abstract
     */
    @JsonProperty("abstract")
    public String getAbstract() {
        return _abstract;
    }

    /**
     * @param _abstract The abstract
     */
    @JsonProperty("abstract")
    public void setAbstract(String _abstract) {
        this._abstract = _abstract;
    }

    /**
     * @return The publishedDate
     */
    @JsonProperty("published_date")
    public String getPublishedDate() {
        return publishedDate;
    }

    /**
     * @param publishedDate The published_date
     */
    @JsonProperty("published_date")
    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    /**
     * @return The source
     */
    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    /**
     * @param source The source
     */
    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * @return The views
     */
    @JsonProperty("views")
    public Integer getViews() {
        return views;
    }

    /**
     * @param views The views
     */
    @JsonProperty("views")
    public void setViews(Integer views) {
        this.views = views;
    }
/*
    *//**
     * @return The desFacet
     *//*
    @JsonProperty("des_facet")
    public List<String> getDesFacet() {
        return desFacet;
    }

    *//**
     * @param desFacet The des_facet
     *//*
    @JsonProperty("des_facet")
    public void setDesFacet(List<String> desFacet) {
        this.desFacet = desFacet;
    }

    *//**
     * @return The orgFacet
     *//*
    @JsonProperty("org_facet")
    public String getOrgFacet() {
        return orgFacet;
    }

    *//**
     * @param orgFacet The org_facet
     *//*
    @JsonProperty("org_facet")
    public void setOrgFacet(String orgFacet) {
        this.orgFacet = orgFacet;
    }

    *//**
     * @return The perFacet
     *//*
    @JsonProperty("per_facet")
    public List<String> getPerFacet() {
        return perFacet;
    }

    *//**
     * @param perFacet The per_facet
     *//*
    @JsonProperty("per_facet")
    public void setPerFacet(List<String> perFacet) {
        this.perFacet = perFacet;
    }

    *//**
     * @return The geoFacet
     *//*
    @JsonProperty("geo_facet")
    public List<String> getGeoFacet() {
        return geoFacet;
    }

    *//**
     * @param geoFacet The geo_facet
     *//*
    @JsonProperty("geo_facet")
    public void setGeoFacet(List<String> geoFacet) {
        this.geoFacet = geoFacet;
    }

    *//**
     * @return The media
     *//*
    @JsonProperty("media")
    public List<Medium> getMedia() {
        return media;
    }

    *//**
     * @param media The media
     *//*
    @JsonProperty("media")
    public void setMedia(List<Medium> media) {
        this.media = media;
    }*/
}