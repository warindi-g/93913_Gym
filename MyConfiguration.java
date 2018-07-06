package android.example.com.a93913_gym;

import com.sromku.simple.fb.Permission;
import com.sromku.simple.fb.SimpleFacebookConfiguration;

public class MyConfiguration {
    Permission[] permissions=new Permission[]{Permission.EMAIL};
    static final String APP_ID="2080988422229087";

    public SimpleFacebookConfiguration getMyConfigs()
    {
        SimpleFacebookConfiguration configs=new SimpleFacebookConfiguration.Builder()
                .setAppId(APP_ID)
                .setNamespace("facebookstart")
                .setPermissions(permissions)
                .build();

        return configs;
    }
}
