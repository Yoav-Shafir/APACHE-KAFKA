/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package kafka.dev.avro.schemaEvolution;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class CustomerV2 extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 4572008263374780673L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CustomerV2\",\"namespace\":\"kafka.dev.avro.schemaEvolution\",\"fields\":[{\"name\":\"first_name\",\"type\":\"string\",\"doc\":\"First Name of Customer\"},{\"name\":\"last_name\",\"type\":\"string\",\"doc\":\"Last Name of Customer\"},{\"name\":\"age\",\"type\":\"int\",\"doc\":\"Age at the time of registration\"},{\"name\":\"height\",\"type\":\"float\",\"doc\":\"Height at the time of registration in cm\"},{\"name\":\"weight\",\"type\":\"float\",\"doc\":\"Weight at the time of registration in kg\"},{\"name\":\"phone_number\",\"type\":[\"null\",\"string\"],\"doc\":\"optional phone number\",\"default\":null},{\"name\":\"email\",\"type\":\"string\",\"doc\":\"email address\",\"default\":\"missing@example.com\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** First Name of Customer */
  @Deprecated public java.lang.CharSequence first_name;
  /** Last Name of Customer */
  @Deprecated public java.lang.CharSequence last_name;
  /** Age at the time of registration */
  @Deprecated public int age;
  /** Height at the time of registration in cm */
  @Deprecated public float height;
  /** Weight at the time of registration in kg */
  @Deprecated public float weight;
  /** optional phone number */
  @Deprecated public java.lang.CharSequence phone_number;
  /** email address */
  @Deprecated public java.lang.CharSequence email;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public CustomerV2() {}

  /**
   * All-args constructor.
   * @param first_name First Name of Customer
   * @param last_name Last Name of Customer
   * @param age Age at the time of registration
   * @param height Height at the time of registration in cm
   * @param weight Weight at the time of registration in kg
   * @param phone_number optional phone number
   * @param email email address
   */
  public CustomerV2(java.lang.CharSequence first_name, java.lang.CharSequence last_name, java.lang.Integer age, java.lang.Float height, java.lang.Float weight, java.lang.CharSequence phone_number, java.lang.CharSequence email) {
    this.first_name = first_name;
    this.last_name = last_name;
    this.age = age;
    this.height = height;
    this.weight = weight;
    this.phone_number = phone_number;
    this.email = email;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return first_name;
    case 1: return last_name;
    case 2: return age;
    case 3: return height;
    case 4: return weight;
    case 5: return phone_number;
    case 6: return email;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: first_name = (java.lang.CharSequence)value$; break;
    case 1: last_name = (java.lang.CharSequence)value$; break;
    case 2: age = (java.lang.Integer)value$; break;
    case 3: height = (java.lang.Float)value$; break;
    case 4: weight = (java.lang.Float)value$; break;
    case 5: phone_number = (java.lang.CharSequence)value$; break;
    case 6: email = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'first_name' field.
   * @return First Name of Customer
   */
  public java.lang.CharSequence getFirstName() {
    return first_name;
  }

  /**
   * Sets the value of the 'first_name' field.
   * First Name of Customer
   * @param value the value to set.
   */
  public void setFirstName(java.lang.CharSequence value) {
    this.first_name = value;
  }

  /**
   * Gets the value of the 'last_name' field.
   * @return Last Name of Customer
   */
  public java.lang.CharSequence getLastName() {
    return last_name;
  }

  /**
   * Sets the value of the 'last_name' field.
   * Last Name of Customer
   * @param value the value to set.
   */
  public void setLastName(java.lang.CharSequence value) {
    this.last_name = value;
  }

  /**
   * Gets the value of the 'age' field.
   * @return Age at the time of registration
   */
  public java.lang.Integer getAge() {
    return age;
  }

  /**
   * Sets the value of the 'age' field.
   * Age at the time of registration
   * @param value the value to set.
   */
  public void setAge(java.lang.Integer value) {
    this.age = value;
  }

  /**
   * Gets the value of the 'height' field.
   * @return Height at the time of registration in cm
   */
  public java.lang.Float getHeight() {
    return height;
  }

  /**
   * Sets the value of the 'height' field.
   * Height at the time of registration in cm
   * @param value the value to set.
   */
  public void setHeight(java.lang.Float value) {
    this.height = value;
  }

  /**
   * Gets the value of the 'weight' field.
   * @return Weight at the time of registration in kg
   */
  public java.lang.Float getWeight() {
    return weight;
  }

  /**
   * Sets the value of the 'weight' field.
   * Weight at the time of registration in kg
   * @param value the value to set.
   */
  public void setWeight(java.lang.Float value) {
    this.weight = value;
  }

  /**
   * Gets the value of the 'phone_number' field.
   * @return optional phone number
   */
  public java.lang.CharSequence getPhoneNumber() {
    return phone_number;
  }

  /**
   * Sets the value of the 'phone_number' field.
   * optional phone number
   * @param value the value to set.
   */
  public void setPhoneNumber(java.lang.CharSequence value) {
    this.phone_number = value;
  }

  /**
   * Gets the value of the 'email' field.
   * @return email address
   */
  public java.lang.CharSequence getEmail() {
    return email;
  }

  /**
   * Sets the value of the 'email' field.
   * email address
   * @param value the value to set.
   */
  public void setEmail(java.lang.CharSequence value) {
    this.email = value;
  }

  /**
   * Creates a new CustomerV2 RecordBuilder.
   * @return A new CustomerV2 RecordBuilder
   */
  public static kafka.dev.avro.schemaEvolution.CustomerV2.Builder newBuilder() {
    return new kafka.dev.avro.schemaEvolution.CustomerV2.Builder();
  }

  /**
   * Creates a new CustomerV2 RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new CustomerV2 RecordBuilder
   */
  public static kafka.dev.avro.schemaEvolution.CustomerV2.Builder newBuilder(kafka.dev.avro.schemaEvolution.CustomerV2.Builder other) {
    return new kafka.dev.avro.schemaEvolution.CustomerV2.Builder(other);
  }

  /**
   * Creates a new CustomerV2 RecordBuilder by copying an existing CustomerV2 instance.
   * @param other The existing instance to copy.
   * @return A new CustomerV2 RecordBuilder
   */
  public static kafka.dev.avro.schemaEvolution.CustomerV2.Builder newBuilder(kafka.dev.avro.schemaEvolution.CustomerV2 other) {
    return new kafka.dev.avro.schemaEvolution.CustomerV2.Builder(other);
  }

  /**
   * RecordBuilder for CustomerV2 instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CustomerV2>
    implements org.apache.avro.data.RecordBuilder<CustomerV2> {

    /** First Name of Customer */
    private java.lang.CharSequence first_name;
    /** Last Name of Customer */
    private java.lang.CharSequence last_name;
    /** Age at the time of registration */
    private int age;
    /** Height at the time of registration in cm */
    private float height;
    /** Weight at the time of registration in kg */
    private float weight;
    /** optional phone number */
    private java.lang.CharSequence phone_number;
    /** email address */
    private java.lang.CharSequence email;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(kafka.dev.avro.schemaEvolution.CustomerV2.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.first_name)) {
        this.first_name = data().deepCopy(fields()[0].schema(), other.first_name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.last_name)) {
        this.last_name = data().deepCopy(fields()[1].schema(), other.last_name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.age)) {
        this.age = data().deepCopy(fields()[2].schema(), other.age);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.height)) {
        this.height = data().deepCopy(fields()[3].schema(), other.height);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.weight)) {
        this.weight = data().deepCopy(fields()[4].schema(), other.weight);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.phone_number)) {
        this.phone_number = data().deepCopy(fields()[5].schema(), other.phone_number);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.email)) {
        this.email = data().deepCopy(fields()[6].schema(), other.email);
        fieldSetFlags()[6] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing CustomerV2 instance
     * @param other The existing instance to copy.
     */
    private Builder(kafka.dev.avro.schemaEvolution.CustomerV2 other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.first_name)) {
        this.first_name = data().deepCopy(fields()[0].schema(), other.first_name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.last_name)) {
        this.last_name = data().deepCopy(fields()[1].schema(), other.last_name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.age)) {
        this.age = data().deepCopy(fields()[2].schema(), other.age);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.height)) {
        this.height = data().deepCopy(fields()[3].schema(), other.height);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.weight)) {
        this.weight = data().deepCopy(fields()[4].schema(), other.weight);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.phone_number)) {
        this.phone_number = data().deepCopy(fields()[5].schema(), other.phone_number);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.email)) {
        this.email = data().deepCopy(fields()[6].schema(), other.email);
        fieldSetFlags()[6] = true;
      }
    }

    /**
      * Gets the value of the 'first_name' field.
      * First Name of Customer
      * @return The value.
      */
    public java.lang.CharSequence getFirstName() {
      return first_name;
    }

    /**
      * Sets the value of the 'first_name' field.
      * First Name of Customer
      * @param value The value of 'first_name'.
      * @return This builder.
      */
    public kafka.dev.avro.schemaEvolution.CustomerV2.Builder setFirstName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.first_name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'first_name' field has been set.
      * First Name of Customer
      * @return True if the 'first_name' field has been set, false otherwise.
      */
    public boolean hasFirstName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'first_name' field.
      * First Name of Customer
      * @return This builder.
      */
    public kafka.dev.avro.schemaEvolution.CustomerV2.Builder clearFirstName() {
      first_name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'last_name' field.
      * Last Name of Customer
      * @return The value.
      */
    public java.lang.CharSequence getLastName() {
      return last_name;
    }

    /**
      * Sets the value of the 'last_name' field.
      * Last Name of Customer
      * @param value The value of 'last_name'.
      * @return This builder.
      */
    public kafka.dev.avro.schemaEvolution.CustomerV2.Builder setLastName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.last_name = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'last_name' field has been set.
      * Last Name of Customer
      * @return True if the 'last_name' field has been set, false otherwise.
      */
    public boolean hasLastName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'last_name' field.
      * Last Name of Customer
      * @return This builder.
      */
    public kafka.dev.avro.schemaEvolution.CustomerV2.Builder clearLastName() {
      last_name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'age' field.
      * Age at the time of registration
      * @return The value.
      */
    public java.lang.Integer getAge() {
      return age;
    }

    /**
      * Sets the value of the 'age' field.
      * Age at the time of registration
      * @param value The value of 'age'.
      * @return This builder.
      */
    public kafka.dev.avro.schemaEvolution.CustomerV2.Builder setAge(int value) {
      validate(fields()[2], value);
      this.age = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'age' field has been set.
      * Age at the time of registration
      * @return True if the 'age' field has been set, false otherwise.
      */
    public boolean hasAge() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'age' field.
      * Age at the time of registration
      * @return This builder.
      */
    public kafka.dev.avro.schemaEvolution.CustomerV2.Builder clearAge() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'height' field.
      * Height at the time of registration in cm
      * @return The value.
      */
    public java.lang.Float getHeight() {
      return height;
    }

    /**
      * Sets the value of the 'height' field.
      * Height at the time of registration in cm
      * @param value The value of 'height'.
      * @return This builder.
      */
    public kafka.dev.avro.schemaEvolution.CustomerV2.Builder setHeight(float value) {
      validate(fields()[3], value);
      this.height = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'height' field has been set.
      * Height at the time of registration in cm
      * @return True if the 'height' field has been set, false otherwise.
      */
    public boolean hasHeight() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'height' field.
      * Height at the time of registration in cm
      * @return This builder.
      */
    public kafka.dev.avro.schemaEvolution.CustomerV2.Builder clearHeight() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'weight' field.
      * Weight at the time of registration in kg
      * @return The value.
      */
    public java.lang.Float getWeight() {
      return weight;
    }

    /**
      * Sets the value of the 'weight' field.
      * Weight at the time of registration in kg
      * @param value The value of 'weight'.
      * @return This builder.
      */
    public kafka.dev.avro.schemaEvolution.CustomerV2.Builder setWeight(float value) {
      validate(fields()[4], value);
      this.weight = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'weight' field has been set.
      * Weight at the time of registration in kg
      * @return True if the 'weight' field has been set, false otherwise.
      */
    public boolean hasWeight() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'weight' field.
      * Weight at the time of registration in kg
      * @return This builder.
      */
    public kafka.dev.avro.schemaEvolution.CustomerV2.Builder clearWeight() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'phone_number' field.
      * optional phone number
      * @return The value.
      */
    public java.lang.CharSequence getPhoneNumber() {
      return phone_number;
    }

    /**
      * Sets the value of the 'phone_number' field.
      * optional phone number
      * @param value The value of 'phone_number'.
      * @return This builder.
      */
    public kafka.dev.avro.schemaEvolution.CustomerV2.Builder setPhoneNumber(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.phone_number = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'phone_number' field has been set.
      * optional phone number
      * @return True if the 'phone_number' field has been set, false otherwise.
      */
    public boolean hasPhoneNumber() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'phone_number' field.
      * optional phone number
      * @return This builder.
      */
    public kafka.dev.avro.schemaEvolution.CustomerV2.Builder clearPhoneNumber() {
      phone_number = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'email' field.
      * email address
      * @return The value.
      */
    public java.lang.CharSequence getEmail() {
      return email;
    }

    /**
      * Sets the value of the 'email' field.
      * email address
      * @param value The value of 'email'.
      * @return This builder.
      */
    public kafka.dev.avro.schemaEvolution.CustomerV2.Builder setEmail(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.email = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'email' field has been set.
      * email address
      * @return True if the 'email' field has been set, false otherwise.
      */
    public boolean hasEmail() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'email' field.
      * email address
      * @return This builder.
      */
    public kafka.dev.avro.schemaEvolution.CustomerV2.Builder clearEmail() {
      email = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    public CustomerV2 build() {
      try {
        CustomerV2 record = new CustomerV2();
        record.first_name = fieldSetFlags()[0] ? this.first_name : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.last_name = fieldSetFlags()[1] ? this.last_name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.age = fieldSetFlags()[2] ? this.age : (java.lang.Integer) defaultValue(fields()[2]);
        record.height = fieldSetFlags()[3] ? this.height : (java.lang.Float) defaultValue(fields()[3]);
        record.weight = fieldSetFlags()[4] ? this.weight : (java.lang.Float) defaultValue(fields()[4]);
        record.phone_number = fieldSetFlags()[5] ? this.phone_number : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.email = fieldSetFlags()[6] ? this.email : (java.lang.CharSequence) defaultValue(fields()[6]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
