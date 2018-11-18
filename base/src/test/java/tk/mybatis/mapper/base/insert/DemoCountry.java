package tk.mybatis.mapper.base.insert;

import javax.persistence.Id;

/**
 * @description:
 * @author: qrqhuangcy
 * @date: 2018-11-18
 **/
public class DemoCountry {
    @Id
    private Integer countryId;

    private String countryCode;

    private String countryName;

    public DemoCountry(Integer countryId, String countryCode, String countryName) {
        this.countryId = countryId;
        this.countryCode = countryCode;
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        return "DemoCountry{" +
                "countryId=" + countryId +
                ", countryCode='" + countryCode + '\'' +
                ", countryName='" + countryName + '\'' +
                '}';
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
