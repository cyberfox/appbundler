package com.oracle.appbundler;

/**
 * Track custom plist entries.
 * Usage:
 * <pre>
 * {@code
 *   <bundleapp ...>
 *     ...
 *     <plistentry key="SUCheckAtStartup" value="YES"/>
 *     <plistentry key="SUScheduledCheckInterval" value="86400"/>
 *     <plistentry key="SUPublicDSAKeyFile" value="dsa_pub.pem"/>
 *     <plistentry key="SUFeedURL" value="https://www.example.com/sparkle/updates.xml"/>
 *     <plistentry key="SUShowReleaseNotes" value="YES"/>
 *   </bundleapp>
 * }</pre>
 */
public class PlistEntry {
  private String value = null;
  private String key = null;

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public String getKey() {
    return key;
  }

  public void setKey(final String key) {
    this.key = key;
  }

  @Override
  public String toString() {
    return key == null ? value : key + "=" + value;
  }
}
