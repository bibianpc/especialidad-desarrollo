package com.bcaicedo.solidcleancode.actividad1a;


public class PatientsRegistrationSystem {

    private final DataValidator validator;

    private final UserInterfaceManager manager;

    private final DatabaseManager dbManager;

    public PatientsRegistrationSystem (DataValidator validator, UserInterfaceManager manager, DatabaseManager dbManager) {

        this.validator = validator;

        this.manager = manager;

        this.dbManager = dbManager;

    }

    public void registerPatient (PatientData patientData) {

        if (validator.validatePatientData(patientData)) {

            UserInterfaceManager.displayPatientData(patientData);

            dbManager.savePatientData(patientData);

        }

    }
}
