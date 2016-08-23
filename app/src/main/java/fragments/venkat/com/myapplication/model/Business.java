package fragments.venkat.com.myapplication.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by venkatgonuguntala on 8/11/16.
 */
public class Business {

    @JsonProperty("status")
    private String status;
    @JsonProperty("copyright")
    private String copyright;
    @JsonProperty("num_results")
    private Integer numResults;
    @JsonProperty("results")
    private List<Result> results = new ArrayList<Result>();

    /**
     *
     * @return
     * The status
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     *
     * @param status
     * The status
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
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
     * The numResults
     */
    @JsonProperty("num_results")
    public Integer getNumResults() {
        return numResults;
    }

    /**
     *
     * @param numResults
     * The num_results
     */
    @JsonProperty("num_results")
    public void setNumResults(Integer numResults) {
        this.numResults = numResults;
    }

    /**
     *
     * @return
     * The results
     */
    @JsonProperty("results")
    public List<Result> getResults() {
        return results;
    }

    /**
     *
     * @param results
     * The results
     */
    @JsonProperty("results")
    public void setResults(List<Result> results) {
        this.results = results;
    }
}
