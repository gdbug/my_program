/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package yjmyzz.thrift.study.dto;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2017-12-11")
public class Person implements org.apache.thrift.TBase<Person, Person._Fields>, java.io.Serializable, Cloneable, Comparable<Person> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Person");

  private static final org.apache.thrift.protocol.TField AGE_FIELD_DESC = new org.apache.thrift.protocol.TField("age", org.apache.thrift.protocol.TType.I16, (short)1);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField SEX_FIELD_DESC = new org.apache.thrift.protocol.TField("sex", org.apache.thrift.protocol.TType.BOOL, (short)3);
  private static final org.apache.thrift.protocol.TField SALARY_FIELD_DESC = new org.apache.thrift.protocol.TField("salary", org.apache.thrift.protocol.TType.DOUBLE, (short)4);
  private static final org.apache.thrift.protocol.TField CHILDREN_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("childrenCount", org.apache.thrift.protocol.TType.BYTE, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new PersonStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new PersonTupleSchemeFactory();

  public short age; // required
  public java.lang.String name; // required
  public boolean sex; // required
  public double salary; // required
  public byte childrenCount; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    AGE((short)1, "age"),
    NAME((short)2, "name"),
    SEX((short)3, "sex"),
    SALARY((short)4, "salary"),
    CHILDREN_COUNT((short)5, "childrenCount");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // AGE
          return AGE;
        case 2: // NAME
          return NAME;
        case 3: // SEX
          return SEX;
        case 4: // SALARY
          return SALARY;
        case 5: // CHILDREN_COUNT
          return CHILDREN_COUNT;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __AGE_ISSET_ID = 0;
  private static final int __SEX_ISSET_ID = 1;
  private static final int __SALARY_ISSET_ID = 2;
  private static final int __CHILDRENCOUNT_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.AGE, new org.apache.thrift.meta_data.FieldMetaData("age", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SEX, new org.apache.thrift.meta_data.FieldMetaData("sex", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.SALARY, new org.apache.thrift.meta_data.FieldMetaData("salary", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.CHILDREN_COUNT, new org.apache.thrift.meta_data.FieldMetaData("childrenCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Person.class, metaDataMap);
  }

  public Person() {
    this.age = (short)0;

  }

  public Person(
    short age,
    java.lang.String name,
    boolean sex,
    double salary,
    byte childrenCount)
  {
    this();
    this.age = age;
    setAgeIsSet(true);
    this.name = name;
    this.sex = sex;
    setSexIsSet(true);
    this.salary = salary;
    setSalaryIsSet(true);
    this.childrenCount = childrenCount;
    setChildrenCountIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Person(Person other) {
    __isset_bitfield = other.__isset_bitfield;
    this.age = other.age;
    if (other.isSetName()) {
      this.name = other.name;
    }
    this.sex = other.sex;
    this.salary = other.salary;
    this.childrenCount = other.childrenCount;
  }

  public Person deepCopy() {
    return new Person(this);
  }

  @Override
  public void clear() {
    this.age = (short)0;

    this.name = null;
    setSexIsSet(false);
    this.sex = false;
    setSalaryIsSet(false);
    this.salary = 0.0;
    setChildrenCountIsSet(false);
    this.childrenCount = 0;
  }

  public short getAge() {
    return this.age;
  }

  public Person setAge(short age) {
    this.age = age;
    setAgeIsSet(true);
    return this;
  }

  public void unsetAge() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __AGE_ISSET_ID);
  }

  /** Returns true if field age is set (has been assigned a value) and false otherwise */
  public boolean isSetAge() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __AGE_ISSET_ID);
  }

  public void setAgeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __AGE_ISSET_ID, value);
  }

  public java.lang.String getName() {
    return this.name;
  }

  public Person setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public boolean isSex() {
    return this.sex;
  }

  public Person setSex(boolean sex) {
    this.sex = sex;
    setSexIsSet(true);
    return this;
  }

  public void unsetSex() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SEX_ISSET_ID);
  }

  /** Returns true if field sex is set (has been assigned a value) and false otherwise */
  public boolean isSetSex() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SEX_ISSET_ID);
  }

  public void setSexIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SEX_ISSET_ID, value);
  }

  public double getSalary() {
    return this.salary;
  }

  public Person setSalary(double salary) {
    this.salary = salary;
    setSalaryIsSet(true);
    return this;
  }

  public void unsetSalary() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SALARY_ISSET_ID);
  }

  /** Returns true if field salary is set (has been assigned a value) and false otherwise */
  public boolean isSetSalary() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SALARY_ISSET_ID);
  }

  public void setSalaryIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SALARY_ISSET_ID, value);
  }

  public byte getChildrenCount() {
    return this.childrenCount;
  }

  public Person setChildrenCount(byte childrenCount) {
    this.childrenCount = childrenCount;
    setChildrenCountIsSet(true);
    return this;
  }

  public void unsetChildrenCount() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CHILDRENCOUNT_ISSET_ID);
  }

  /** Returns true if field childrenCount is set (has been assigned a value) and false otherwise */
  public boolean isSetChildrenCount() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CHILDRENCOUNT_ISSET_ID);
  }

  public void setChildrenCountIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CHILDRENCOUNT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case AGE:
      if (value == null) {
        unsetAge();
      } else {
        setAge((java.lang.Short)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((java.lang.String)value);
      }
      break;

    case SEX:
      if (value == null) {
        unsetSex();
      } else {
        setSex((java.lang.Boolean)value);
      }
      break;

    case SALARY:
      if (value == null) {
        unsetSalary();
      } else {
        setSalary((java.lang.Double)value);
      }
      break;

    case CHILDREN_COUNT:
      if (value == null) {
        unsetChildrenCount();
      } else {
        setChildrenCount((java.lang.Byte)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case AGE:
      return getAge();

    case NAME:
      return getName();

    case SEX:
      return isSex();

    case SALARY:
      return getSalary();

    case CHILDREN_COUNT:
      return getChildrenCount();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case AGE:
      return isSetAge();
    case NAME:
      return isSetName();
    case SEX:
      return isSetSex();
    case SALARY:
      return isSetSalary();
    case CHILDREN_COUNT:
      return isSetChildrenCount();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Person)
      return this.equals((Person)that);
    return false;
  }

  public boolean equals(Person that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_age = true;
    boolean that_present_age = true;
    if (this_present_age || that_present_age) {
      if (!(this_present_age && that_present_age))
        return false;
      if (this.age != that.age)
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_sex = true;
    boolean that_present_sex = true;
    if (this_present_sex || that_present_sex) {
      if (!(this_present_sex && that_present_sex))
        return false;
      if (this.sex != that.sex)
        return false;
    }

    boolean this_present_salary = true;
    boolean that_present_salary = true;
    if (this_present_salary || that_present_salary) {
      if (!(this_present_salary && that_present_salary))
        return false;
      if (this.salary != that.salary)
        return false;
    }

    boolean this_present_childrenCount = true;
    boolean that_present_childrenCount = true;
    if (this_present_childrenCount || that_present_childrenCount) {
      if (!(this_present_childrenCount && that_present_childrenCount))
        return false;
      if (this.childrenCount != that.childrenCount)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + age;

    hashCode = hashCode * 8191 + ((isSetName()) ? 131071 : 524287);
    if (isSetName())
      hashCode = hashCode * 8191 + name.hashCode();

    hashCode = hashCode * 8191 + ((sex) ? 131071 : 524287);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(salary);

    hashCode = hashCode * 8191 + (int) (childrenCount);

    return hashCode;
  }

  @Override
  public int compareTo(Person other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetAge()).compareTo(other.isSetAge());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAge()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.age, other.age);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSex()).compareTo(other.isSetSex());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSex()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sex, other.sex);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSalary()).compareTo(other.isSetSalary());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSalary()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.salary, other.salary);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetChildrenCount()).compareTo(other.isSetChildrenCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChildrenCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.childrenCount, other.childrenCount);
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
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Person(");
    boolean first = true;

    sb.append("age:");
    sb.append(this.age);
    first = false;
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("sex:");
    sb.append(this.sex);
    first = false;
    if (!first) sb.append(", ");
    sb.append("salary:");
    sb.append(this.salary);
    first = false;
    if (!first) sb.append(", ");
    sb.append("childrenCount:");
    sb.append(this.childrenCount);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PersonStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PersonStandardScheme getScheme() {
      return new PersonStandardScheme();
    }
  }

  private static class PersonStandardScheme extends org.apache.thrift.scheme.StandardScheme<Person> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Person struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // AGE
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.age = iprot.readI16();
              struct.setAgeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SEX
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.sex = iprot.readBool();
              struct.setSexIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SALARY
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.salary = iprot.readDouble();
              struct.setSalaryIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // CHILDREN_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.childrenCount = iprot.readByte();
              struct.setChildrenCountIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Person struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(AGE_FIELD_DESC);
      oprot.writeI16(struct.age);
      oprot.writeFieldEnd();
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(SEX_FIELD_DESC);
      oprot.writeBool(struct.sex);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SALARY_FIELD_DESC);
      oprot.writeDouble(struct.salary);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(CHILDREN_COUNT_FIELD_DESC);
      oprot.writeByte(struct.childrenCount);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PersonTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PersonTupleScheme getScheme() {
      return new PersonTupleScheme();
    }
  }

  private static class PersonTupleScheme extends org.apache.thrift.scheme.TupleScheme<Person> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Person struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetAge()) {
        optionals.set(0);
      }
      if (struct.isSetName()) {
        optionals.set(1);
      }
      if (struct.isSetSex()) {
        optionals.set(2);
      }
      if (struct.isSetSalary()) {
        optionals.set(3);
      }
      if (struct.isSetChildrenCount()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetAge()) {
        oprot.writeI16(struct.age);
      }
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetSex()) {
        oprot.writeBool(struct.sex);
      }
      if (struct.isSetSalary()) {
        oprot.writeDouble(struct.salary);
      }
      if (struct.isSetChildrenCount()) {
        oprot.writeByte(struct.childrenCount);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Person struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.age = iprot.readI16();
        struct.setAgeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.sex = iprot.readBool();
        struct.setSexIsSet(true);
      }
      if (incoming.get(3)) {
        struct.salary = iprot.readDouble();
        struct.setSalaryIsSet(true);
      }
      if (incoming.get(4)) {
        struct.childrenCount = iprot.readByte();
        struct.setChildrenCountIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

