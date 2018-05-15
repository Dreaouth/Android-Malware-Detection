package adstatic.tools;


import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/**
 * 一个漏洞描述中，会有一个文本描述，以及多个直观语句的描述
 */
public class VulnRetu implements Serializable {

    private static final long serialVersionUID = -5809782578272943999L;
    private String desc;
    private LinkedList<StmtInfo> stmtInfos;


    public VulnRetu(String desc, StmtInfo... stmtInfos){

        this.desc = desc;
        this.stmtInfos = new LinkedList<StmtInfo>();
        for (StmtInfo stmtinfo : stmtInfos) {
            this.stmtInfos.add(stmtinfo);
        }
    }

    public VulnRetu(String desc, LinkedList<StmtInfo> stmtInfos){
        this.desc = desc;
        this.stmtInfos = stmtInfos;
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();

        for (StmtInfo stmtInfo : stmtInfos)  {
            stringBuilder.append(stmtInfo.toString());
            stringBuilder.append("\r\n");
        }

        return stringBuilder.toString();
    }

    public String getStmtInfos(){

        StringBuilder stringBuilder = new StringBuilder();
        for (StmtInfo stmtInfo : stmtInfos)  {

            stringBuilder.append(stmtInfo.toString());
            stringBuilder.append("\r\n");
        }

        return stringBuilder.toString();
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public List<StmtInfo> getStmtDesc() {
        return stmtInfos;
    }

    public void setStmtDesc(LinkedList<StmtInfo> stmtDesc) {
        this.stmtInfos = stmtDesc;
    }

}
