package adstatic.tools;

import java.io.Serializable;

public class StmtInfo implements Serializable {

    private static final long serialVersionUID = -5809782578272943999L;
    private String sootClass;
    private String sootMethod;
    private String stmt;

    public StmtInfo(String sootClass, String sootMethod, String stmt){
        this.sootClass = sootClass;
        this.sootMethod = sootMethod;
        this.stmt = stmt;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        if(sootClass != null){
            stringBuilder.append(sootClass);
        }

        if(sootMethod != null){
            stringBuilder.append("\r\n    -");
            stringBuilder.append(sootMethod);
        }

        if(stmt != null){
            stringBuilder.append("\r\n        -");
            stringBuilder.append(stmt);
        }

        return stringBuilder.toString();
    }

    public String getSootClass() {
        return sootClass;
    }

    public void setSootClass(String sootClass) {
        this.sootClass = sootClass;
    }

    public String getSootMethod() {
        return sootMethod;
    }

    public void setSootMethod(String sootMethod) {
        this.sootMethod = sootMethod;
    }

    public String getStmt() {
        return stmt;
    }

    public void setStmt(String stmt) {
        this.stmt = stmt;
    }
}
