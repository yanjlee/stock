package douglas.stock.spider;

import java.util.Date;
import java.util.List;

/**
 * Created by wgz on 15/3/29.
 */
public class Record {
    private Date date;
    private String code;
    private String category;
    private List<String> fields;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<String> getFields() {
        return fields;
    }

    public void setFields(List<String> fields) {
        this.fields = fields;
    }
}