package grails3

class AccountEntity {

    String email
    String password
    boolean isEmailValidated
    boolean isOtpValidated
    Date dateCreated

    Set<DeviceEntity> devices
    static hasMany = [devices: DeviceEntity]

    static constraints = {
    }

    /**
     * Email has been confirmed and OneTimePassword has been validated
     */
    boolean isAccountConfirmed(){
        return this.isEmailValidated && this.isOtpValidated
    }
}
