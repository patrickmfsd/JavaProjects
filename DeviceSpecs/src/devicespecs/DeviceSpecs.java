/*
 * File Created by Patrick Mifsud.
 * Copyright © 2016 Patrick Mifsud. All rights reserved.
 */

package devicespecs;

import java.io.File;
import java.lang.management.ManagementFactory;

public class DeviceSpecs {

    public static void main(String[] args) {
    System.out.println("Device Specs");
    System.out.println("\nVersion 1.0");
    System.out.println("Copyright © 2016 Patrick Mifsud.");
    System.out.println("All Rights Reserved");

    /* OS Info */
    String nameOS = "os.name"; 
    String versionOS = "os.version";  
    String architectureOS = "os.arch";
    System.out.println("\n-----------------------------------");
    System.out.println("OS");
    System.out.println("-----------------------------------");
    System.out.println("Name: " + System.getProperty(nameOS));
    System.out.println("Version: " + System.getProperty(versionOS));
    System.out.println("Architecture: " + System.getProperty(architectureOS));
    
    /* CPU */
    System.out.println("\n-----------------------------------");
    System.out.println("CPU");
    System.out.println("-----------------------------------");
    System.out.println("Physical and Virtual: " + Runtime.getRuntime().availableProcessors() + " Cores");
    
    /* RAM */
    System.out.println("\n-----------------------------------");
    System.out.println("RAM");
    System.out.println("-----------------------------------");
    long mem = ((com.sun.management.OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean()).getTotalPhysicalMemorySize();
    System.out.println("Physical Memory: " + mem / (1024 * 1024 * 1024) + " GB");
    
    /* Storage */
    System.out.println("\n-----------------------------------");
    System.out.println("Storage");
    System.out.println("-----------------------------------");
    File[] roots = File.listRoots();
    for (File root : roots) {
      System.out.println("Total space: " + root.getTotalSpace()/ (1000 * 1000 * 1000) + " GB");
      System.out.println("Free space: " + root.getFreeSpace()/ (1000 * 1000 * 1000) + " GB");
      System.out.println("Usable space: " + root.getUsableSpace()/ (1000 * 1000 * 1000) + " GB");
    }
    }

}
