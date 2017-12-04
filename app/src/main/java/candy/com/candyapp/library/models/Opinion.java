package candy.com.candyapp.library.models;


import candy.com.candyapp.library.CandyEntity;
import candy.com.candyapp.library.annotation.DatabaseField;


/**
 * Created by hakan on 11/26/17.
 */

public class Opinion extends CandyEntity<Opinion> {


    @DatabaseField(FieldName = "ID",DataType = "INTEGER",PrimaryKey = true,AutoIncrement = true)
    private int opinionId;

    @DatabaseField(FieldName = "OPINOIN_DESC",DataType = "TEXT")
    private String opinionDesc;

    @DatabaseField(FieldName = "TYPE",DataType = "TEXT")
    private String opinionType;

    @DatabaseField(FieldName = "CREATE_DATE",DataType = "TEXT")
    private String createdDate;

    public Opinion()
    {

    }

    public Opinion( int opinionId, String opinionDesc, String opinionType, String createdDate)
    {
        this.opinionId=opinionId;
        this.opinionDesc = opinionDesc;
        this.opinionType=opinionType;
        this.createdDate=createdDate;
    }


    public int getOpinionId() {
        return opinionId;
    }

    public void setOpinionId(int opinionId) {
        this.opinionId = opinionId;
    }

    public String getOpinionDesc() {
        return opinionDesc;
    }

    public void setOpinionDesc(String opinionDesc) {
        this.opinionDesc = opinionDesc;
    }

    public String getOpinionType() {
        return opinionType;
    }

    public void setOpinionType(String opinionType) {
        this.opinionType = opinionType;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }
}
