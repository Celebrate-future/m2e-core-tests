/*******************************************************************************
 * Copyright (c) 2008 Sonatype, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package org.maven.ide.eclipse.tests.common;

import java.io.File;

import org.maven.ide.eclipse.MavenPlugin;
import org.maven.ide.eclipse.embedder.IMavenConfiguration;


public class MavenHelpers {

  public static String setUserSettings(String settingsFile) {
    if(settingsFile != null && settingsFile.length() > 0) {
      settingsFile = new File(settingsFile).getAbsolutePath();
    }
    IMavenConfiguration mavenConfiguration = MavenPlugin.getDefault().getMavenConfiguration();
    String oldUserSettingsFile = mavenConfiguration.getUserSettingsFile();
    mavenConfiguration.setUserSettingsFile(settingsFile);
    return oldUserSettingsFile;
  }

  public static String getUserSettings() {
    IMavenConfiguration mavenConfiguration = MavenPlugin.getDefault().getMavenConfiguration();
    return mavenConfiguration.getUserSettingsFile();
  }

}