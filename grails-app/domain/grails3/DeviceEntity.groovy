package grails3

class DeviceEntity {

    String deviceUuid
    String devicePublicKey
    String deviceIp
    String umsPublicKey
    String umsIp
    Date dateCreated
    Date lastUpdate

    AccountEntity account

    static constraints = {
    }

    /**
     * Device public key has been generated and has been transmitted
     */
    boolean isDeviceRegistered(){
        return this.devicePublicKey
    }
}
