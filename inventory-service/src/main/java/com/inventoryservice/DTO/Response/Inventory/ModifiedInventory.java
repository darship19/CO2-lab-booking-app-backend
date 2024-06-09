package com.inventoryservice.DTO.Response.Inventory;


import com.inventoryservice.DTO.Response.Software.ModifiedSoftware;
import com.inventoryservice.Enums.STATUS;
import com.inventoryservice.Models.Inventory;
import com.inventoryservice.Models.Software;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ModifiedInventory {

    private UUID id;
    private String name;
    private String serialNum;
    private String manufacturer;
    private String model;
    private String processor;
    private String memoryType;
    private String memorySize;
    private String storageType;
    private String storageSize;
    private String operatingSystem;
    private LocalDate purchaseDate;
    private Float purchaseCost;
    private LocalDate warrantyExpiry;
    private String shortNote;
    private LocalDate lastMaintenanceDate;
    private LocalDate nextMaintenanceDate;
    private STATUS status;
    private Set<ModifiedSoftware> installedSoftwares = new HashSet<>();



    public ModifiedInventory (Inventory inventory){
        this.id=inventory.getId();
        this.name=inventory.getName();
        this.serialNum=inventory.getSerialNum();
        this.manufacturer=inventory.getManufacturer();
        this.model=inventory.getModel();
        this.processor=inventory.getProcessor();
        this.memoryType=inventory.getMemoryType();
        this.memorySize=inventory.getMemorySize();
        this.storageType=inventory.getStorageType();
        this.storageSize=inventory.getStorageSize();
        this.operatingSystem=inventory.getOperatingSystem();
        this.status=inventory.getStatus();
        this.purchaseDate=inventory.getPurchaseDate();
        this.warrantyExpiry=inventory.getWarrantyExpiry();
        this.shortNote=inventory.getShortNote();
        this.lastMaintenanceDate=inventory.getLastMaintenanceDate();
        this.nextMaintenanceDate=inventory.getNextMaintenanceDate();

        Set<Software> temp = inventory.getInstalledSoftwares();
        if (temp != null) {
            for (Software software : temp) {
                this.installedSoftwares.add(new ModifiedSoftware(software));
            }
        }
    }


}
