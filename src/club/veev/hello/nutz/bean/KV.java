package club.veev.hello.nutz.bean;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.Name;
import org.nutz.dao.entity.annotation.Table;

import java.util.Date;

/**
 * Created by Veev on 2017/3/21
 */
@Table("k_v")
public class KV {

    @Id
    private int id;
    @Name
    @Column("_key")
    private String key;
    @Column("_value")
    private String value;
    @Column
    private String salt;
    @Column("createdAt")
    private Date createdAt;
    @Column("updatedAt")
    private Date updatedAt;

    public KV() {
    }

    public KV(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("KV{");
        sb.append("id=").append(id);
        sb.append(", key='").append(key).append('\'');
        sb.append(", value='").append(value).append('\'');
        sb.append(", salt='").append(salt).append('\'');
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append('}');
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
