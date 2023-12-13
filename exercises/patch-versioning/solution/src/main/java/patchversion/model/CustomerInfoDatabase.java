package patchversion.model;

import patchversion.model.CustomerInfoDatabase;

public interface CustomerInfoDatabase {
    CustomerInfo get(String customerID);
}
