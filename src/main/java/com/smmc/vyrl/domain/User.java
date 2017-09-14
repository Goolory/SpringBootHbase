package com.smmc.vyrl.domain;

import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;

import java.util.*;

public class User implements org.apache.thrift.TBase<User, User._Fields>, java.io.Serializable, Cloneable {

    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("User");

    private static final org.apache.thrift.protocol.TField FIRST_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("firstName", org.apache.thrift.protocol.TType.STRING, (short)1);
    private static final org.apache.thrift.protocol.TField LAST_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("lastName", org.apache.thrift.protocol.TType.STRING, (short)2);
    private static final org.apache.thrift.protocol.TField EMAIL_FIELD_DESC = new org.apache.thrift.protocol.TField("email", org.apache.thrift.protocol.TType.STRING, (short)3);
    private static final org.apache.thrift.protocol.TField ADDRESS_FIELD_DESC = new org.apache.thrift.protocol.TField("address", org.apache.thrift.protocol.TType.STRING, (short)4);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
        schemes.put(StandardScheme.class, new UserStandardSchemeFactory());
        schemes.put(TupleScheme.class, new UserTupleSchemeFactory());
    }

    private String firstName; // optional
    private String lastName;  // optional
    private String email;     // optional
    private String address;   // optional

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */

    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
        FIRST_NAME((short)1, "firstName"),
        LAST_NAME((short)2, "lastName"),
        EMAIL((short)3, "email"),
        ADDRESS((short)4, "address");

        private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

        static {
            for (_Fields field : EnumSet.allOf(_Fields.class)) {
                byName.put(field.getFieldName(), field);
            }
        }

        /**
         * Find the _Fields constant that matches fieldId, or null if its not found.
         */
        public static _Fields findByThriftId(int fieldId) {
            switch(fieldId) {
                case 1: // FIRST_NAME
                    return FIRST_NAME;
                case 2: // LAST_NAME
                    return LAST_NAME;
                case 3: // EMAIL
                    return EMAIL;
                case 4: // ADDRESS
                    return ADDRESS;
                default:
                    return null;
            }
        }

        /**
         * Find the _Fields constant that matches fieldId, throwing an exception
         * if it is not found.
         */
        public static _Fields findByThriftIdOrThrow(int fieldId) {
            _Fields fields = findByThriftId(fieldId);
            if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            return fields;
        }

        /**
         * Find the _Fields constant that matches name, or null if its not found.
         */
        public static _Fields findByName(String name) {
            return byName.get(name);
        }

        private final short _thriftId;
        private final String _fieldName;

        _Fields(short thriftId, String fieldName) {
            _thriftId = thriftId;
            _fieldName = fieldName;
        }

        public short getThriftFieldId() {
            return _thriftId;
        }

        public String getFieldName() {
            return _fieldName;
        }
    }

    // isset id assignments
    private _Fields optionals[] = {_Fields.FIRST_NAME,_Fields.LAST_NAME,_Fields.EMAIL,_Fields.ADDRESS};

    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
        Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
        tmpMap.put(_Fields.FIRST_NAME, new org.apache.thrift.meta_data.FieldMetaData("firstName", org.apache.thrift.TFieldRequirementType.OPTIONAL,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        tmpMap.put(_Fields.LAST_NAME, new org.apache.thrift.meta_data.FieldMetaData("lastName", org.apache.thrift.TFieldRequirementType.OPTIONAL,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        tmpMap.put(_Fields.EMAIL, new org.apache.thrift.meta_data.FieldMetaData("email", org.apache.thrift.TFieldRequirementType.OPTIONAL,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        tmpMap.put(_Fields.ADDRESS, new org.apache.thrift.meta_data.FieldMetaData("address", org.apache.thrift.TFieldRequirementType.OPTIONAL,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        metaDataMap = Collections.unmodifiableMap(tmpMap);
        org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(User.class, metaDataMap);
    }

    public User() {
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public User(User other) {
        if (other.isSetFirstName()) {
            this.firstName = other.firstName;
        }
        if (other.isSetLastName()) {
            this.lastName = other.lastName;
        }
        if (other.isSetEmail()) {
            this.email = other.email;
        }
        if (other.isSetAddress()) {
            this.address = other.address;
        }
    }

    public User deepCopy() {
        return new User(this);
    }

    @Override
    public void clear() {
        this.firstName = null;
        this.lastName = null;
        this.email = null;
        this.address = null;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public User setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public void unsetFirstName() {
        this.firstName = null;
    }

    /** Returns true if field firstName is set (has been assigned a value) and false otherwise */
    public boolean isSetFirstName() {
        return this.firstName != null;
    }

    public void setFirstNameIsSet(boolean value) {
        if (!value) {
            this.firstName = null;
        }
    }

    public String getLastName() {
        return this.lastName;
    }

    public User setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public void unsetLastName() {
        this.lastName = null;
    }

    /** Returns true if field lastName is set (has been assigned a value) and false otherwise */
    public boolean isSetLastName() {
        return this.lastName != null;
    }

    public void setLastNameIsSet(boolean value) {
        if (!value) {
            this.lastName = null;
        }
    }

    public String getEmail() {
        return this.email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public void unsetEmail() {
        this.email = null;
    }

    /** Returns true if field email is set (has been assigned a value) and false otherwise */
    public boolean isSetEmail() {
        return this.email != null;
    }

    public void setEmailIsSet(boolean value) {
        if (!value) {
            this.email = null;
        }
    }

    public String getAddress() {
        return this.address;
    }

    public User setAddress(String address) {
        this.address = address;
        return this;
    }

    public void unsetAddress() {
        this.address = null;
    }

    /** Returns true if field address is set (has been assigned a value) and false otherwise */
    public boolean isSetAddress() {
        return this.address != null;
    }

    public void setAddressIsSet(boolean value) {
        if (!value) {
            this.address = null;
        }
    }

    public void setFieldValue(_Fields field, Object value) {
        switch (field) {
            case FIRST_NAME:
                if (value == null) {
                    unsetFirstName();
                } else {
                    setFirstName((String)value);
                }
                break;

            case LAST_NAME:
                if (value == null) {
                    unsetLastName();
                } else {
                    setLastName((String)value);
                }
                break;

            case EMAIL:
                if (value == null) {
                    unsetEmail();
                } else {
                    setEmail((String)value);
                }
                break;

            case ADDRESS:
                if (value == null) {
                    unsetAddress();
                } else {
                    setAddress((String)value);
                }
                break;

        }
    }

    public Object getFieldValue(_Fields field) {
        switch (field) {
            case FIRST_NAME:
                return getFirstName();

            case LAST_NAME:
                return getLastName();

            case EMAIL:
                return getEmail();

            case ADDRESS:
                return getAddress();

        }
        throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }

        switch (field) {
            case FIRST_NAME:
                return isSetFirstName();
            case LAST_NAME:
                return isSetLastName();
            case EMAIL:
                return isSetEmail();
            case ADDRESS:
                return isSetAddress();
        }
        throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
        if (that == null)
            return false;
        if (that instanceof User)
            return this.equals((User)that);
        return false;
    }

    public boolean equals(User that) {
        if (that == null)
            return false;

        boolean this_present_firstName = true && this.isSetFirstName();
        boolean that_present_firstName = true && that.isSetFirstName();
        if (this_present_firstName || that_present_firstName) {
            if (!(this_present_firstName && that_present_firstName))
                return false;
            if (!this.firstName.equals(that.firstName))
                return false;
        }

        boolean this_present_lastName = true && this.isSetLastName();
        boolean that_present_lastName = true && that.isSetLastName();
        if (this_present_lastName || that_present_lastName) {
            if (!(this_present_lastName && that_present_lastName))
                return false;
            if (!this.lastName.equals(that.lastName))
                return false;
        }

        boolean this_present_email = true && this.isSetEmail();
        boolean that_present_email = true && that.isSetEmail();
        if (this_present_email || that_present_email) {
            if (!(this_present_email && that_present_email))
                return false;
            if (!this.email.equals(that.email))
                return false;
        }

        boolean this_present_address = true && this.isSetAddress();
        boolean that_present_address = true && that.isSetAddress();
        if (this_present_address || that_present_address) {
            if (!(this_present_address && that_present_address))
                return false;
            if (!this.address.equals(that.address))
                return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public int compareTo(User other) {
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }

        int lastComparison = 0;
        User typedOther = (User)other;

        lastComparison = Boolean.valueOf(isSetFirstName()).compareTo(typedOther.isSetFirstName());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetFirstName()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.firstName, typedOther.firstName);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetLastName()).compareTo(typedOther.isSetLastName());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetLastName()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lastName, typedOther.lastName);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetEmail()).compareTo(typedOther.isSetEmail());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetEmail()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.email, typedOther.email);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetAddress()).compareTo(typedOther.isSetAddress());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetAddress()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.address, typedOther.address);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        return 0;
    }

    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("User(");
        boolean first = true;

        if (isSetFirstName()) {
            sb.append("firstName:");
            if (this.firstName == null) {
                sb.append("null");
            } else {
                sb.append(this.firstName);
            }
            first = false;
        }
        if (isSetLastName()) {
            if (!first) sb.append(", ");
            sb.append("lastName:");
            if (this.lastName == null) {
                sb.append("null");
            } else {
                sb.append(this.lastName);
            }
            first = false;
        }
        if (isSetEmail()) {
            if (!first) sb.append(", ");
            sb.append("email:");
            if (this.email == null) {
                sb.append("null");
            } else {
                sb.append(this.email);
            }
            first = false;
        }
        if (isSetAddress()) {
            if (!first) sb.append(", ");
            sb.append("address:");
            if (this.address == null) {
                sb.append("null");
            } else {
                sb.append(this.address);
            }
            first = false;
        }
        sb.append(")");
        return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
        // check for required fields
    }

    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        try {
            write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
        } catch (org.apache.thrift.TException te) {
            throw new java.io.IOException(te);
        }
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
        try {
            read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
        } catch (org.apache.thrift.TException te) {
            throw new java.io.IOException(te);
        }
    }

    private static class UserStandardSchemeFactory implements SchemeFactory {
        public UserStandardScheme getScheme() {
            return new UserStandardScheme();
        }
    }

    private static class UserStandardScheme extends StandardScheme<User> {

        public void read(org.apache.thrift.protocol.TProtocol iprot, User struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();
            while (true)
            {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                    break;
                }
                switch (schemeField.id) {
                    case 1: // FIRST_NAME
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.firstName = iprot.readString();
                            struct.setFirstNameIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 2: // LAST_NAME
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.lastName = iprot.readString();
                            struct.setLastNameIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 3: // EMAIL
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.email = iprot.readString();
                            struct.setEmailIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 4: // ADDRESS
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.address = iprot.readString();
                            struct.setAddressIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    default:
                        org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();

            // check for required fields of primitive type, which can't be checked in the validate method
            struct.validate();
        }

        public void write(org.apache.thrift.protocol.TProtocol oprot, User struct) throws org.apache.thrift.TException {
            struct.validate();

            oprot.writeStructBegin(STRUCT_DESC);
            if (struct.firstName != null) {
                if (struct.isSetFirstName()) {
                    oprot.writeFieldBegin(FIRST_NAME_FIELD_DESC);
                    oprot.writeString(struct.firstName);
                    oprot.writeFieldEnd();
                }
            }
            if (struct.lastName != null) {
                if (struct.isSetLastName()) {
                    oprot.writeFieldBegin(LAST_NAME_FIELD_DESC);
                    oprot.writeString(struct.lastName);
                    oprot.writeFieldEnd();
                }
            }
            if (struct.email != null) {
                if (struct.isSetEmail()) {
                    oprot.writeFieldBegin(EMAIL_FIELD_DESC);
                    oprot.writeString(struct.email);
                    oprot.writeFieldEnd();
                }
            }
            if (struct.address != null) {
                if (struct.isSetAddress()) {
                    oprot.writeFieldBegin(ADDRESS_FIELD_DESC);
                    oprot.writeString(struct.address);
                    oprot.writeFieldEnd();
                }
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }

    }

    private static class UserTupleSchemeFactory implements SchemeFactory {
        public UserTupleScheme getScheme() {
            return new UserTupleScheme();
        }
    }

    private static class UserTupleScheme extends TupleScheme<User> {

        @Override
        public void write(org.apache.thrift.protocol.TProtocol prot, User struct) throws org.apache.thrift.TException {
            TTupleProtocol oprot = (TTupleProtocol) prot;
            BitSet optionals = new BitSet();
            if (struct.isSetFirstName()) {
                optionals.set(0);
            }
            if (struct.isSetLastName()) {
                optionals.set(1);
            }
            if (struct.isSetEmail()) {
                optionals.set(2);
            }
            if (struct.isSetAddress()) {
                optionals.set(3);
            }
            oprot.writeBitSet(optionals, 4);
            if (struct.isSetFirstName()) {
                oprot.writeString(struct.firstName);
            }
            if (struct.isSetLastName()) {
                oprot.writeString(struct.lastName);
            }
            if (struct.isSetEmail()) {
                oprot.writeString(struct.email);
            }
            if (struct.isSetAddress()) {
                oprot.writeString(struct.address);
            }
        }

        @Override
        public void read(org.apache.thrift.protocol.TProtocol prot, User struct) throws org.apache.thrift.TException {
            TTupleProtocol iprot = (TTupleProtocol) prot;
            BitSet incoming = iprot.readBitSet(4);
            if (incoming.get(0)) {
                struct.firstName = iprot.readString();
                struct.setFirstNameIsSet(true);
            }
            if (incoming.get(1)) {
                struct.lastName = iprot.readString();
                struct.setLastNameIsSet(true);
            }
            if (incoming.get(2)) {
                struct.email = iprot.readString();
                struct.setEmailIsSet(true);
            }
            if (incoming.get(3)) {
                struct.address = iprot.readString();
                struct.setAddressIsSet(true);
            }
        }
    }

}
