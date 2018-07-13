/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package kafka.dev.avro.specific;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
/** Avro Schema for our Customer */
@org.apache.avro.specific.AvroGenerated
public class Customer extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -3428877671660798059L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Customer\",\"namespace\":\"kafka.dev.avro.specific\",\"doc\":\"Avro Schema for our Customer\",\"fields\":[{\"name\":\"firstName\",\"type\":\"string\",\"doc\":\"First Name of Customer\"},{\"name\":\"lastName\",\"type\":\"string\",\"doc\":\"Last Name of Customer\"},{\"name\":\"age\",\"type\":\"int\",\"doc\":\"Age at the time of registration\"},{\"name\":\"height\",\"type\":\"float\",\"doc\":\"Height at the time of registration in cm\"},{\"name\":\"weight\",\"type\":\"float\",\"doc\":\"Weight at the time of registration in kg\"},{\"name\":\"automatedEmail\",\"type\":\"boolean\",\"doc\":\"Field indicating if the user is enrolled in marketing emails\",\"default\":true}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** First Name of Customer */
  @Deprecated public java.lang.CharSequence firstName;
  /** Last Name of Customer */
  @Deprecated public java.lang.CharSequence lastName;
  /** Age at the time of registration */
  @Deprecated public int age;
  /** Height at the time of registration in cm */
  @Deprecated public float height;
  /** Weight at the time of registration in kg */
  @Deprecated public float weight;
  /** Field indicating if the user is enrolled in marketing emails */
  @Deprecated public boolean automatedEmail;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Customer() {}

  /**
   * All-args constructor.
   * @param firstName First Name of Customer
   * @param lastName Last Name of Customer
   * @param age Age at the time of registration
   * @param height Height at the time of registration in cm
   * @param weight Weight at the time of registration in kg
   * @param automatedEmail Field indicating if the user is enrolled in marketing emails
   */
  public Customer(java.lang.CharSequence firstName, java.lang.CharSequence lastName, java.lang.Integer age, java.lang.Float height, java.lang.Float weight, java.lang.Boolean automatedEmail) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
    this.automatedEmail = automatedEmail;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return firstName;
    case 1: return lastName;
    case 2: return age;
    case 3: return height;
    case 4: return weight;
    case 5: return automatedEmail;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: firstName = (java.lang.CharSequence)value$; break;
    case 1: lastName = (java.lang.CharSequence)value$; break;
    case 2: age = (java.lang.Integer)value$; break;
    case 3: height = (java.lang.Float)value$; break;
    case 4: weight = (java.lang.Float)value$; break;
    case 5: automatedEmail = (java.lang.Boolean)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'firstName' field.
   * @return First Name of Customer
   */
  public java.lang.CharSequence getFirstName() {
    return firstName;
  }

  /**
   * Sets the value of the 'firstName' field.
   * First Name of Customer
   * @param value the value to set.
   */
  public void setFirstName(java.lang.CharSequence value) {
    this.firstName = value;
  }

  /**
   * Gets the value of the 'lastName' field.
   * @return Last Name of Customer
   */
  public java.lang.CharSequence getLastName() {
    return lastName;
  }

  /**
   * Sets the value of the 'lastName' field.
   * Last Name of Customer
   * @param value the value to set.
   */
  public void setLastName(java.lang.CharSequence value) {
    this.lastName = value;
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
   * Gets the value of the 'automatedEmail' field.
   * @return Field indicating if the user is enrolled in marketing emails
   */
  public java.lang.Boolean getAutomatedEmail() {
    return automatedEmail;
  }

  /**
   * Sets the value of the 'automatedEmail' field.
   * Field indicating if the user is enrolled in marketing emails
   * @param value the value to set.
   */
  public void setAutomatedEmail(java.lang.Boolean value) {
    this.automatedEmail = value;
  }

  /**
   * Creates a new Customer RecordBuilder.
   * @return A new Customer RecordBuilder
   */
  public static kafka.dev.avro.specific.Customer.Builder newBuilder() {
    return new kafka.dev.avro.specific.Customer.Builder();
  }

  /**
   * Creates a new Customer RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Customer RecordBuilder
   */
  public static kafka.dev.avro.specific.Customer.Builder newBuilder(kafka.dev.avro.specific.Customer.Builder other) {
    return new kafka.dev.avro.specific.Customer.Builder(other);
  }

  /**
   * Creates a new Customer RecordBuilder by copying an existing Customer instance.
   * @param other The existing instance to copy.
   * @return A new Customer RecordBuilder
   */
  public static kafka.dev.avro.specific.Customer.Builder newBuilder(kafka.dev.avro.specific.Customer other) {
    return new kafka.dev.avro.specific.Customer.Builder(other);
  }

  /**
   * RecordBuilder for Customer instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Customer>
    implements org.apache.avro.data.RecordBuilder<Customer> {

    /** First Name of Customer */
    private java.lang.CharSequence firstName;
    /** Last Name of Customer */
    private java.lang.CharSequence lastName;
    /** Age at the time of registration */
    private int age;
    /** Height at the time of registration in cm */
    private float height;
    /** Weight at the time of registration in kg */
    private float weight;
    /** Field indicating if the user is enrolled in marketing emails */
    private boolean automatedEmail;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(kafka.dev.avro.specific.Customer.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.firstName)) {
        this.firstName = data().deepCopy(fields()[0].schema(), other.firstName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.lastName)) {
        this.lastName = data().deepCopy(fields()[1].schema(), other.lastName);
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
      if (isValidValue(fields()[5], other.automatedEmail)) {
        this.automatedEmail = data().deepCopy(fields()[5].schema(), other.automatedEmail);
        fieldSetFlags()[5] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Customer instance
     * @param other The existing instance to copy.
     */
    private Builder(kafka.dev.avro.specific.Customer other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.firstName)) {
        this.firstName = data().deepCopy(fields()[0].schema(), other.firstName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.lastName)) {
        this.lastName = data().deepCopy(fields()[1].schema(), other.lastName);
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
      if (isValidValue(fields()[5], other.automatedEmail)) {
        this.automatedEmail = data().deepCopy(fields()[5].schema(), other.automatedEmail);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'firstName' field.
      * First Name of Customer
      * @return The value.
      */
    public java.lang.CharSequence getFirstName() {
      return firstName;
    }

    /**
      * Sets the value of the 'firstName' field.
      * First Name of Customer
      * @param value The value of 'firstName'.
      * @return This builder.
      */
    public kafka.dev.avro.specific.Customer.Builder setFirstName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.firstName = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'firstName' field has been set.
      * First Name of Customer
      * @return True if the 'firstName' field has been set, false otherwise.
      */
    public boolean hasFirstName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'firstName' field.
      * First Name of Customer
      * @return This builder.
      */
    public kafka.dev.avro.specific.Customer.Builder clearFirstName() {
      firstName = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'lastName' field.
      * Last Name of Customer
      * @return The value.
      */
    public java.lang.CharSequence getLastName() {
      return lastName;
    }

    /**
      * Sets the value of the 'lastName' field.
      * Last Name of Customer
      * @param value The value of 'lastName'.
      * @return This builder.
      */
    public kafka.dev.avro.specific.Customer.Builder setLastName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.lastName = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'lastName' field has been set.
      * Last Name of Customer
      * @return True if the 'lastName' field has been set, false otherwise.
      */
    public boolean hasLastName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'lastName' field.
      * Last Name of Customer
      * @return This builder.
      */
    public kafka.dev.avro.specific.Customer.Builder clearLastName() {
      lastName = null;
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
    public kafka.dev.avro.specific.Customer.Builder setAge(int value) {
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
    public kafka.dev.avro.specific.Customer.Builder clearAge() {
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
    public kafka.dev.avro.specific.Customer.Builder setHeight(float value) {
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
    public kafka.dev.avro.specific.Customer.Builder clearHeight() {
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
    public kafka.dev.avro.specific.Customer.Builder setWeight(float value) {
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
    public kafka.dev.avro.specific.Customer.Builder clearWeight() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'automatedEmail' field.
      * Field indicating if the user is enrolled in marketing emails
      * @return The value.
      */
    public java.lang.Boolean getAutomatedEmail() {
      return automatedEmail;
    }

    /**
      * Sets the value of the 'automatedEmail' field.
      * Field indicating if the user is enrolled in marketing emails
      * @param value The value of 'automatedEmail'.
      * @return This builder.
      */
    public kafka.dev.avro.specific.Customer.Builder setAutomatedEmail(boolean value) {
      validate(fields()[5], value);
      this.automatedEmail = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'automatedEmail' field has been set.
      * Field indicating if the user is enrolled in marketing emails
      * @return True if the 'automatedEmail' field has been set, false otherwise.
      */
    public boolean hasAutomatedEmail() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'automatedEmail' field.
      * Field indicating if the user is enrolled in marketing emails
      * @return This builder.
      */
    public kafka.dev.avro.specific.Customer.Builder clearAutomatedEmail() {
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    public Customer build() {
      try {
        Customer record = new Customer();
        record.firstName = fieldSetFlags()[0] ? this.firstName : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.lastName = fieldSetFlags()[1] ? this.lastName : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.age = fieldSetFlags()[2] ? this.age : (java.lang.Integer) defaultValue(fields()[2]);
        record.height = fieldSetFlags()[3] ? this.height : (java.lang.Float) defaultValue(fields()[3]);
        record.weight = fieldSetFlags()[4] ? this.weight : (java.lang.Float) defaultValue(fields()[4]);
        record.automatedEmail = fieldSetFlags()[5] ? this.automatedEmail : (java.lang.Boolean) defaultValue(fields()[5]);
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