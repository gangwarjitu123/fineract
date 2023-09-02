/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */

package org.apache.fineract.avro;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class MessageV1 extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord, org.apache.fineract.avro.generator.ByteBufferSerializable {
  private static final long serialVersionUID = 2772084467361894431L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"MessageV1\",\"namespace\":\"org.apache.fineract.avro\",\"fields\":[{\"name\":\"id\",\"type\":\"int\",\"doc\":\"The ID of the message to be sent\"},{\"name\":\"source\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"A unique identifier of the source service\"},{\"name\":\"type\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The type of event the payload refers to. For example LoanApprovedBusinessEvent\"},{\"name\":\"category\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The category of event the payload refers to. For example LOAN\"},{\"name\":\"createdAt\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The UTC time of when the event has been raised; in ISO_LOCAL_DATE_TIME format. For example 2011-12-03T10:15:30\"},{\"name\":\"businessDate\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The business date when the event has been raised; in ISO_LOCAL_DATE format. For example 2011-12-03\"},{\"name\":\"tenantId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The tenantId that the event has been sent from. For example default\"},{\"name\":\"idempotencyKey\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The idempotency key for this particular event for consumer de-duplication\"},{\"name\":\"dataschema\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The fully qualified name of the schema of the event payload. For example org.apache.fineract.avro.loan.v1.LoanAccountDataV1\"},{\"name\":\"data\",\"type\":\"bytes\",\"doc\":\"The payload data serialized into Avro bytes\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<MessageV1> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<MessageV1> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<MessageV1> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<MessageV1> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<MessageV1> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this MessageV1 to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  @Override
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a MessageV1 from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a MessageV1 instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static MessageV1 fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** The ID of the message to be sent */
  private int id;
  /** A unique identifier of the source service */
  private java.lang.String source;
  /** The type of event the payload refers to. For example LoanApprovedBusinessEvent */
  private java.lang.String type;
  /** The category of event the payload refers to. For example LOAN */
  private java.lang.String category;
  /** The UTC time of when the event has been raised; in ISO_LOCAL_DATE_TIME format. For example 2011-12-03T10:15:30 */
  private java.lang.String createdAt;
  /** The business date when the event has been raised; in ISO_LOCAL_DATE format. For example 2011-12-03 */
  private java.lang.String businessDate;
  /** The tenantId that the event has been sent from. For example default */
  private java.lang.String tenantId;
  /** The idempotency key for this particular event for consumer de-duplication */
  private java.lang.String idempotencyKey;
  /** The fully qualified name of the schema of the event payload. For example org.apache.fineract.avro.loan.v1.LoanAccountDataV1 */
  private java.lang.String dataschema;
  /** The payload data serialized into Avro bytes */
  private java.nio.ByteBuffer data;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public MessageV1() {}

  /**
   * All-args constructor.
   * @param id The ID of the message to be sent
   * @param source A unique identifier of the source service
   * @param type The type of event the payload refers to. For example LoanApprovedBusinessEvent
   * @param category The category of event the payload refers to. For example LOAN
   * @param createdAt The UTC time of when the event has been raised; in ISO_LOCAL_DATE_TIME format. For example 2011-12-03T10:15:30
   * @param businessDate The business date when the event has been raised; in ISO_LOCAL_DATE format. For example 2011-12-03
   * @param tenantId The tenantId that the event has been sent from. For example default
   * @param idempotencyKey The idempotency key for this particular event for consumer de-duplication
   * @param dataschema The fully qualified name of the schema of the event payload. For example org.apache.fineract.avro.loan.v1.LoanAccountDataV1
   * @param data The payload data serialized into Avro bytes
   */
  public MessageV1(java.lang.Integer id, java.lang.String source, java.lang.String type, java.lang.String category, java.lang.String createdAt, java.lang.String businessDate, java.lang.String tenantId, java.lang.String idempotencyKey, java.lang.String dataschema, java.nio.ByteBuffer data) {
    this.id = id;
    this.source = source;
    this.type = type;
    this.category = category;
    this.createdAt = createdAt;
    this.businessDate = businessDate;
    this.tenantId = tenantId;
    this.idempotencyKey = idempotencyKey;
    this.dataschema = dataschema;
    this.data = data;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return source;
    case 2: return type;
    case 3: return category;
    case 4: return createdAt;
    case 5: return businessDate;
    case 6: return tenantId;
    case 7: return idempotencyKey;
    case 8: return dataschema;
    case 9: return data;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.Integer)value$; break;
    case 1: source = value$ != null ? value$.toString() : null; break;
    case 2: type = value$ != null ? value$.toString() : null; break;
    case 3: category = value$ != null ? value$.toString() : null; break;
    case 4: createdAt = value$ != null ? value$.toString() : null; break;
    case 5: businessDate = value$ != null ? value$.toString() : null; break;
    case 6: tenantId = value$ != null ? value$.toString() : null; break;
    case 7: idempotencyKey = value$ != null ? value$.toString() : null; break;
    case 8: dataschema = value$ != null ? value$.toString() : null; break;
    case 9: data = (java.nio.ByteBuffer)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The ID of the message to be sent
   */
  public int getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * The ID of the message to be sent
   * @param value the value to set.
   */
  public void setId(int value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'source' field.
   * @return A unique identifier of the source service
   */
  public java.lang.String getSource() {
    return source;
  }


  /**
   * Sets the value of the 'source' field.
   * A unique identifier of the source service
   * @param value the value to set.
   */
  public void setSource(java.lang.String value) {
    this.source = value;
  }

  /**
   * Gets the value of the 'type' field.
   * @return The type of event the payload refers to. For example LoanApprovedBusinessEvent
   */
  public java.lang.String getType() {
    return type;
  }


  /**
   * Sets the value of the 'type' field.
   * The type of event the payload refers to. For example LoanApprovedBusinessEvent
   * @param value the value to set.
   */
  public void setType(java.lang.String value) {
    this.type = value;
  }

  /**
   * Gets the value of the 'category' field.
   * @return The category of event the payload refers to. For example LOAN
   */
  public java.lang.String getCategory() {
    return category;
  }


  /**
   * Sets the value of the 'category' field.
   * The category of event the payload refers to. For example LOAN
   * @param value the value to set.
   */
  public void setCategory(java.lang.String value) {
    this.category = value;
  }

  /**
   * Gets the value of the 'createdAt' field.
   * @return The UTC time of when the event has been raised; in ISO_LOCAL_DATE_TIME format. For example 2011-12-03T10:15:30
   */
  public java.lang.String getCreatedAt() {
    return createdAt;
  }


  /**
   * Sets the value of the 'createdAt' field.
   * The UTC time of when the event has been raised; in ISO_LOCAL_DATE_TIME format. For example 2011-12-03T10:15:30
   * @param value the value to set.
   */
  public void setCreatedAt(java.lang.String value) {
    this.createdAt = value;
  }

  /**
   * Gets the value of the 'businessDate' field.
   * @return The business date when the event has been raised; in ISO_LOCAL_DATE format. For example 2011-12-03
   */
  public java.lang.String getBusinessDate() {
    return businessDate;
  }


  /**
   * Sets the value of the 'businessDate' field.
   * The business date when the event has been raised; in ISO_LOCAL_DATE format. For example 2011-12-03
   * @param value the value to set.
   */
  public void setBusinessDate(java.lang.String value) {
    this.businessDate = value;
  }

  /**
   * Gets the value of the 'tenantId' field.
   * @return The tenantId that the event has been sent from. For example default
   */
  public java.lang.String getTenantId() {
    return tenantId;
  }


  /**
   * Sets the value of the 'tenantId' field.
   * The tenantId that the event has been sent from. For example default
   * @param value the value to set.
   */
  public void setTenantId(java.lang.String value) {
    this.tenantId = value;
  }

  /**
   * Gets the value of the 'idempotencyKey' field.
   * @return The idempotency key for this particular event for consumer de-duplication
   */
  public java.lang.String getIdempotencyKey() {
    return idempotencyKey;
  }


  /**
   * Sets the value of the 'idempotencyKey' field.
   * The idempotency key for this particular event for consumer de-duplication
   * @param value the value to set.
   */
  public void setIdempotencyKey(java.lang.String value) {
    this.idempotencyKey = value;
  }

  /**
   * Gets the value of the 'dataschema' field.
   * @return The fully qualified name of the schema of the event payload. For example org.apache.fineract.avro.loan.v1.LoanAccountDataV1
   */
  public java.lang.String getDataschema() {
    return dataschema;
  }


  /**
   * Sets the value of the 'dataschema' field.
   * The fully qualified name of the schema of the event payload. For example org.apache.fineract.avro.loan.v1.LoanAccountDataV1
   * @param value the value to set.
   */
  public void setDataschema(java.lang.String value) {
    this.dataschema = value;
  }

  /**
   * Gets the value of the 'data' field.
   * @return The payload data serialized into Avro bytes
   */
  public java.nio.ByteBuffer getData() {
    return data;
  }


  /**
   * Sets the value of the 'data' field.
   * The payload data serialized into Avro bytes
   * @param value the value to set.
   */
  public void setData(java.nio.ByteBuffer value) {
    this.data = value;
  }

  /**
   * Creates a new MessageV1 RecordBuilder.
   * @return A new MessageV1 RecordBuilder
   */
  public static org.apache.fineract.avro.MessageV1.Builder newBuilder() {
    return new org.apache.fineract.avro.MessageV1.Builder();
  }

  /**
   * Creates a new MessageV1 RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new MessageV1 RecordBuilder
   */
  public static org.apache.fineract.avro.MessageV1.Builder newBuilder(org.apache.fineract.avro.MessageV1.Builder other) {
    if (other == null) {
      return new org.apache.fineract.avro.MessageV1.Builder();
    } else {
      return new org.apache.fineract.avro.MessageV1.Builder(other);
    }
  }

  /**
   * Creates a new MessageV1 RecordBuilder by copying an existing MessageV1 instance.
   * @param other The existing instance to copy.
   * @return A new MessageV1 RecordBuilder
   */
  public static org.apache.fineract.avro.MessageV1.Builder newBuilder(org.apache.fineract.avro.MessageV1 other) {
    if (other == null) {
      return new org.apache.fineract.avro.MessageV1.Builder();
    } else {
      return new org.apache.fineract.avro.MessageV1.Builder(other);
    }
  }

  /**
   * RecordBuilder for MessageV1 instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<MessageV1>
    implements org.apache.avro.data.RecordBuilder<MessageV1> {

    /** The ID of the message to be sent */
    private int id;
    /** A unique identifier of the source service */
    private java.lang.String source;
    /** The type of event the payload refers to. For example LoanApprovedBusinessEvent */
    private java.lang.String type;
    /** The category of event the payload refers to. For example LOAN */
    private java.lang.String category;
    /** The UTC time of when the event has been raised; in ISO_LOCAL_DATE_TIME format. For example 2011-12-03T10:15:30 */
    private java.lang.String createdAt;
    /** The business date when the event has been raised; in ISO_LOCAL_DATE format. For example 2011-12-03 */
    private java.lang.String businessDate;
    /** The tenantId that the event has been sent from. For example default */
    private java.lang.String tenantId;
    /** The idempotency key for this particular event for consumer de-duplication */
    private java.lang.String idempotencyKey;
    /** The fully qualified name of the schema of the event payload. For example org.apache.fineract.avro.loan.v1.LoanAccountDataV1 */
    private java.lang.String dataschema;
    /** The payload data serialized into Avro bytes */
    private java.nio.ByteBuffer data;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.apache.fineract.avro.MessageV1.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.source)) {
        this.source = data().deepCopy(fields()[1].schema(), other.source);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.type)) {
        this.type = data().deepCopy(fields()[2].schema(), other.type);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.category)) {
        this.category = data().deepCopy(fields()[3].schema(), other.category);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.createdAt)) {
        this.createdAt = data().deepCopy(fields()[4].schema(), other.createdAt);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.businessDate)) {
        this.businessDate = data().deepCopy(fields()[5].schema(), other.businessDate);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.tenantId)) {
        this.tenantId = data().deepCopy(fields()[6].schema(), other.tenantId);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
      if (isValidValue(fields()[7], other.idempotencyKey)) {
        this.idempotencyKey = data().deepCopy(fields()[7].schema(), other.idempotencyKey);
        fieldSetFlags()[7] = other.fieldSetFlags()[7];
      }
      if (isValidValue(fields()[8], other.dataschema)) {
        this.dataschema = data().deepCopy(fields()[8].schema(), other.dataschema);
        fieldSetFlags()[8] = other.fieldSetFlags()[8];
      }
      if (isValidValue(fields()[9], other.data)) {
        this.data = data().deepCopy(fields()[9].schema(), other.data);
        fieldSetFlags()[9] = other.fieldSetFlags()[9];
      }
    }

    /**
     * Creates a Builder by copying an existing MessageV1 instance
     * @param other The existing instance to copy.
     */
    private Builder(org.apache.fineract.avro.MessageV1 other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.source)) {
        this.source = data().deepCopy(fields()[1].schema(), other.source);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.type)) {
        this.type = data().deepCopy(fields()[2].schema(), other.type);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.category)) {
        this.category = data().deepCopy(fields()[3].schema(), other.category);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.createdAt)) {
        this.createdAt = data().deepCopy(fields()[4].schema(), other.createdAt);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.businessDate)) {
        this.businessDate = data().deepCopy(fields()[5].schema(), other.businessDate);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.tenantId)) {
        this.tenantId = data().deepCopy(fields()[6].schema(), other.tenantId);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.idempotencyKey)) {
        this.idempotencyKey = data().deepCopy(fields()[7].schema(), other.idempotencyKey);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.dataschema)) {
        this.dataschema = data().deepCopy(fields()[8].schema(), other.dataschema);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.data)) {
        this.data = data().deepCopy(fields()[9].schema(), other.data);
        fieldSetFlags()[9] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * The ID of the message to be sent
      * @return The value.
      */
    public int getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * The ID of the message to be sent
      * @param value The value of 'id'.
      * @return This builder.
      */
    public org.apache.fineract.avro.MessageV1.Builder setId(int value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * The ID of the message to be sent
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * The ID of the message to be sent
      * @return This builder.
      */
    public org.apache.fineract.avro.MessageV1.Builder clearId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'source' field.
      * A unique identifier of the source service
      * @return The value.
      */
    public java.lang.String getSource() {
      return source;
    }


    /**
      * Sets the value of the 'source' field.
      * A unique identifier of the source service
      * @param value The value of 'source'.
      * @return This builder.
      */
    public org.apache.fineract.avro.MessageV1.Builder setSource(java.lang.String value) {
      validate(fields()[1], value);
      this.source = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'source' field has been set.
      * A unique identifier of the source service
      * @return True if the 'source' field has been set, false otherwise.
      */
    public boolean hasSource() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'source' field.
      * A unique identifier of the source service
      * @return This builder.
      */
    public org.apache.fineract.avro.MessageV1.Builder clearSource() {
      source = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'type' field.
      * The type of event the payload refers to. For example LoanApprovedBusinessEvent
      * @return The value.
      */
    public java.lang.String getType() {
      return type;
    }


    /**
      * Sets the value of the 'type' field.
      * The type of event the payload refers to. For example LoanApprovedBusinessEvent
      * @param value The value of 'type'.
      * @return This builder.
      */
    public org.apache.fineract.avro.MessageV1.Builder setType(java.lang.String value) {
      validate(fields()[2], value);
      this.type = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'type' field has been set.
      * The type of event the payload refers to. For example LoanApprovedBusinessEvent
      * @return True if the 'type' field has been set, false otherwise.
      */
    public boolean hasType() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'type' field.
      * The type of event the payload refers to. For example LoanApprovedBusinessEvent
      * @return This builder.
      */
    public org.apache.fineract.avro.MessageV1.Builder clearType() {
      type = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'category' field.
      * The category of event the payload refers to. For example LOAN
      * @return The value.
      */
    public java.lang.String getCategory() {
      return category;
    }


    /**
      * Sets the value of the 'category' field.
      * The category of event the payload refers to. For example LOAN
      * @param value The value of 'category'.
      * @return This builder.
      */
    public org.apache.fineract.avro.MessageV1.Builder setCategory(java.lang.String value) {
      validate(fields()[3], value);
      this.category = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'category' field has been set.
      * The category of event the payload refers to. For example LOAN
      * @return True if the 'category' field has been set, false otherwise.
      */
    public boolean hasCategory() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'category' field.
      * The category of event the payload refers to. For example LOAN
      * @return This builder.
      */
    public org.apache.fineract.avro.MessageV1.Builder clearCategory() {
      category = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'createdAt' field.
      * The UTC time of when the event has been raised; in ISO_LOCAL_DATE_TIME format. For example 2011-12-03T10:15:30
      * @return The value.
      */
    public java.lang.String getCreatedAt() {
      return createdAt;
    }


    /**
      * Sets the value of the 'createdAt' field.
      * The UTC time of when the event has been raised; in ISO_LOCAL_DATE_TIME format. For example 2011-12-03T10:15:30
      * @param value The value of 'createdAt'.
      * @return This builder.
      */
    public org.apache.fineract.avro.MessageV1.Builder setCreatedAt(java.lang.String value) {
      validate(fields()[4], value);
      this.createdAt = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'createdAt' field has been set.
      * The UTC time of when the event has been raised; in ISO_LOCAL_DATE_TIME format. For example 2011-12-03T10:15:30
      * @return True if the 'createdAt' field has been set, false otherwise.
      */
    public boolean hasCreatedAt() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'createdAt' field.
      * The UTC time of when the event has been raised; in ISO_LOCAL_DATE_TIME format. For example 2011-12-03T10:15:30
      * @return This builder.
      */
    public org.apache.fineract.avro.MessageV1.Builder clearCreatedAt() {
      createdAt = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'businessDate' field.
      * The business date when the event has been raised; in ISO_LOCAL_DATE format. For example 2011-12-03
      * @return The value.
      */
    public java.lang.String getBusinessDate() {
      return businessDate;
    }


    /**
      * Sets the value of the 'businessDate' field.
      * The business date when the event has been raised; in ISO_LOCAL_DATE format. For example 2011-12-03
      * @param value The value of 'businessDate'.
      * @return This builder.
      */
    public org.apache.fineract.avro.MessageV1.Builder setBusinessDate(java.lang.String value) {
      validate(fields()[5], value);
      this.businessDate = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'businessDate' field has been set.
      * The business date when the event has been raised; in ISO_LOCAL_DATE format. For example 2011-12-03
      * @return True if the 'businessDate' field has been set, false otherwise.
      */
    public boolean hasBusinessDate() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'businessDate' field.
      * The business date when the event has been raised; in ISO_LOCAL_DATE format. For example 2011-12-03
      * @return This builder.
      */
    public org.apache.fineract.avro.MessageV1.Builder clearBusinessDate() {
      businessDate = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'tenantId' field.
      * The tenantId that the event has been sent from. For example default
      * @return The value.
      */
    public java.lang.String getTenantId() {
      return tenantId;
    }


    /**
      * Sets the value of the 'tenantId' field.
      * The tenantId that the event has been sent from. For example default
      * @param value The value of 'tenantId'.
      * @return This builder.
      */
    public org.apache.fineract.avro.MessageV1.Builder setTenantId(java.lang.String value) {
      validate(fields()[6], value);
      this.tenantId = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'tenantId' field has been set.
      * The tenantId that the event has been sent from. For example default
      * @return True if the 'tenantId' field has been set, false otherwise.
      */
    public boolean hasTenantId() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'tenantId' field.
      * The tenantId that the event has been sent from. For example default
      * @return This builder.
      */
    public org.apache.fineract.avro.MessageV1.Builder clearTenantId() {
      tenantId = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'idempotencyKey' field.
      * The idempotency key for this particular event for consumer de-duplication
      * @return The value.
      */
    public java.lang.String getIdempotencyKey() {
      return idempotencyKey;
    }


    /**
      * Sets the value of the 'idempotencyKey' field.
      * The idempotency key for this particular event for consumer de-duplication
      * @param value The value of 'idempotencyKey'.
      * @return This builder.
      */
    public org.apache.fineract.avro.MessageV1.Builder setIdempotencyKey(java.lang.String value) {
      validate(fields()[7], value);
      this.idempotencyKey = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'idempotencyKey' field has been set.
      * The idempotency key for this particular event for consumer de-duplication
      * @return True if the 'idempotencyKey' field has been set, false otherwise.
      */
    public boolean hasIdempotencyKey() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'idempotencyKey' field.
      * The idempotency key for this particular event for consumer de-duplication
      * @return This builder.
      */
    public org.apache.fineract.avro.MessageV1.Builder clearIdempotencyKey() {
      idempotencyKey = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'dataschema' field.
      * The fully qualified name of the schema of the event payload. For example org.apache.fineract.avro.loan.v1.LoanAccountDataV1
      * @return The value.
      */
    public java.lang.String getDataschema() {
      return dataschema;
    }


    /**
      * Sets the value of the 'dataschema' field.
      * The fully qualified name of the schema of the event payload. For example org.apache.fineract.avro.loan.v1.LoanAccountDataV1
      * @param value The value of 'dataschema'.
      * @return This builder.
      */
    public org.apache.fineract.avro.MessageV1.Builder setDataschema(java.lang.String value) {
      validate(fields()[8], value);
      this.dataschema = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'dataschema' field has been set.
      * The fully qualified name of the schema of the event payload. For example org.apache.fineract.avro.loan.v1.LoanAccountDataV1
      * @return True if the 'dataschema' field has been set, false otherwise.
      */
    public boolean hasDataschema() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'dataschema' field.
      * The fully qualified name of the schema of the event payload. For example org.apache.fineract.avro.loan.v1.LoanAccountDataV1
      * @return This builder.
      */
    public org.apache.fineract.avro.MessageV1.Builder clearDataschema() {
      dataschema = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'data' field.
      * The payload data serialized into Avro bytes
      * @return The value.
      */
    public java.nio.ByteBuffer getData() {
      return data;
    }


    /**
      * Sets the value of the 'data' field.
      * The payload data serialized into Avro bytes
      * @param value The value of 'data'.
      * @return This builder.
      */
    public org.apache.fineract.avro.MessageV1.Builder setData(java.nio.ByteBuffer value) {
      validate(fields()[9], value);
      this.data = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'data' field has been set.
      * The payload data serialized into Avro bytes
      * @return True if the 'data' field has been set, false otherwise.
      */
    public boolean hasData() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'data' field.
      * The payload data serialized into Avro bytes
      * @return This builder.
      */
    public org.apache.fineract.avro.MessageV1.Builder clearData() {
      data = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public MessageV1 build() {
      try {
        MessageV1 record = new MessageV1();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.Integer) defaultValue(fields()[0]);
        record.source = fieldSetFlags()[1] ? this.source : (java.lang.String) defaultValue(fields()[1]);
        record.type = fieldSetFlags()[2] ? this.type : (java.lang.String) defaultValue(fields()[2]);
        record.category = fieldSetFlags()[3] ? this.category : (java.lang.String) defaultValue(fields()[3]);
        record.createdAt = fieldSetFlags()[4] ? this.createdAt : (java.lang.String) defaultValue(fields()[4]);
        record.businessDate = fieldSetFlags()[5] ? this.businessDate : (java.lang.String) defaultValue(fields()[5]);
        record.tenantId = fieldSetFlags()[6] ? this.tenantId : (java.lang.String) defaultValue(fields()[6]);
        record.idempotencyKey = fieldSetFlags()[7] ? this.idempotencyKey : (java.lang.String) defaultValue(fields()[7]);
        record.dataschema = fieldSetFlags()[8] ? this.dataschema : (java.lang.String) defaultValue(fields()[8]);
        record.data = fieldSetFlags()[9] ? this.data : (java.nio.ByteBuffer) defaultValue(fields()[9]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<MessageV1>
    WRITER$ = (org.apache.avro.io.DatumWriter<MessageV1>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<MessageV1>
    READER$ = (org.apache.avro.io.DatumReader<MessageV1>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeInt(this.id);

    out.writeString(this.source);

    out.writeString(this.type);

    out.writeString(this.category);

    out.writeString(this.createdAt);

    out.writeString(this.businessDate);

    out.writeString(this.tenantId);

    out.writeString(this.idempotencyKey);

    out.writeString(this.dataschema);

    out.writeBytes(this.data);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.id = in.readInt();

      this.source = in.readString();

      this.type = in.readString();

      this.category = in.readString();

      this.createdAt = in.readString();

      this.businessDate = in.readString();

      this.tenantId = in.readString();

      this.idempotencyKey = in.readString();

      this.dataschema = in.readString();

      this.data = in.readBytes(this.data);

    } else {
      for (int i = 0; i < 10; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.id = in.readInt();
          break;

        case 1:
          this.source = in.readString();
          break;

        case 2:
          this.type = in.readString();
          break;

        case 3:
          this.category = in.readString();
          break;

        case 4:
          this.createdAt = in.readString();
          break;

        case 5:
          this.businessDate = in.readString();
          break;

        case 6:
          this.tenantId = in.readString();
          break;

        case 7:
          this.idempotencyKey = in.readString();
          break;

        case 8:
          this.dataschema = in.readString();
          break;

        case 9:
          this.data = in.readBytes(this.data);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










