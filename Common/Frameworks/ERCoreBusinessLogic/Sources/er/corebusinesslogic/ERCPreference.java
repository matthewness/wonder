// ERCPreference.java
// (c) by Anjo Krank (ak@kcmedia.ag)
package er.corebusinesslogic;
import com.webobjects.eocontrol.*;
import er.extensions.eof.EOEnterpriseObjectClazz;
import er.extensions.logging.ERXLogger;

public class ERCPreference extends _ERCPreference {
    static final ERXLogger log = ERXLogger.getERXLogger(ERCPreference.class);

    public ERCPreference() {
        super();
    }

    public void awakeFromInsertion(EOEditingContext ec) {
        super.awakeFromInsertion(ec);
    }
    
    
    // Class methods go here
    
    public static class ERCPreferenceClazz extends _ERCPreferenceClazz {
        
    }

    public static ERCPreferenceClazz preferenceClazz() { return (ERCPreferenceClazz) EOEnterpriseObjectClazz.clazzForEntityNamed("ERCPreference"); }
}