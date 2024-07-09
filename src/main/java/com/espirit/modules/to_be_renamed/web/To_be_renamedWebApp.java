package com.espirit.modules.to_be_renamed.web;

import com.espirit.moddev.components.annotations.WebAppComponent;
import com.espirit.moddev.components.annotations.WebResource;
import de.espirit.firstspirit.module.WebApp;
import de.espirit.firstspirit.module.WebEnvironment;
import de.espirit.firstspirit.module.descriptor.WebAppDescriptor;

@WebAppComponent(name = "to_be_renamed-web-app",
        displayName = "To_be_renamed Web App",
        webXml = "web/web.xml",
        xmlSchemaVersion = "6.0",
        webResources = {
                @WebResource(path = "to_be_renamed/", name = "to_be_renamed-web-resources", version = "1.0.0", targetPath = "to_be_renamed/")
        }
)
public class To_be_renamedWebApp implements WebApp {

        @Override
        public void createWar() {
                // Nothing needs to be done here
        }

        @Override
        public void init(WebAppDescriptor webAppDescriptor, WebEnvironment webEnvironment) {
                // Nothing needs to be done here
        }

        @Override
        public void installed() {
                // Nothing needs to be done here
        }

        @Override
        public void uninstalling() {
                // Nothing needs to be done here
        }

        @Override
        public void updated(String s) {
                // Nothing needs to be done here
        }

}
