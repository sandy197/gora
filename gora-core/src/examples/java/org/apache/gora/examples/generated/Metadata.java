/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.apache.gora.examples.generated;  
@SuppressWarnings("all")
public class Metadata extends org.apache.gora.persistency.impl.PersistentBase implements org.apache.avro.specific.SpecificRecord, org.apache.gora.persistency.Persistent {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Metadata\",\"namespace\":\"org.apache.gora.examples.generated\",\"fields\":[{\"name\":\"__g__dirty\",\"type\":\"bytes\",\"doc\":\"Bytes used to represent weather or not a field is dirty.\",\"default\":\"AA==\"},{\"name\":\"version\",\"type\":\"int\",\"default\":0},{\"name\":\"data\",\"type\":{\"type\":\"map\",\"values\":\"string\"},\"default\":null}]}");
  
  public static final String[] _ALL_FIELDS = {
  "__g__dirty",
  "version",
  "data",
  };

  /** Bytes used to represent weather or not a field is dirty. */
  private java.nio.ByteBuffer __g__dirty = java.nio.ByteBuffer.wrap(new byte[1]);
  private int version;
  private java.util.Map<java.lang.CharSequence,java.lang.CharSequence> data;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return __g__dirty;
    case 1: return version;
    case 2: return data;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: __g__dirty = (java.nio.ByteBuffer)value$; break;
    case 1: version = (java.lang.Integer)value$; break;
    case 2: data = (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'version' field.
   */
  public java.lang.Integer getVersion() {
    return version;
  }

  /**
   * Sets the value of the 'version' field.
   * @param value the value to set.
   */
  public void setVersion(java.lang.Integer value) {
    this.version = value;
    setDirty(1);
  }
  
  /**
   * Checks the dirty status of the 'version' field. A field is dirty if it represents a change that has not yet been written to the database.
   * @param value the value to set.
   */
  public boolean isVersionDirty(java.lang.Integer value) {
    return isDirty(1);
  }

  /**
   * Gets the value of the 'data' field.
   */
  public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getData() {
    return data;
  }

  /**
   * Sets the value of the 'data' field.
   * @param value the value to set.
   */
  public void setData(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
    this.data = (value instanceof org.apache.gora.persistency.Dirtyable) ? value : new org.apache.gora.persistency.impl.DirtyMapWrapper(value);
    setDirty(2);
  }
  
  /**
   * Checks the dirty status of the 'data' field. A field is dirty if it represents a change that has not yet been written to the database.
   * @param value the value to set.
   */
  public boolean isDataDirty(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
    return isDirty(2);
  }

  /** Creates a new Metadata RecordBuilder */
  public static org.apache.gora.examples.generated.Metadata.Builder newBuilder() {
    return new org.apache.gora.examples.generated.Metadata.Builder();
  }
  
  /** Creates a new Metadata RecordBuilder by copying an existing Builder */
  public static org.apache.gora.examples.generated.Metadata.Builder newBuilder(org.apache.gora.examples.generated.Metadata.Builder other) {
    return new org.apache.gora.examples.generated.Metadata.Builder(other);
  }
  
  /** Creates a new Metadata RecordBuilder by copying an existing Metadata instance */
  public static org.apache.gora.examples.generated.Metadata.Builder newBuilder(org.apache.gora.examples.generated.Metadata other) {
    return new org.apache.gora.examples.generated.Metadata.Builder(other);
  }
  
  private static java.nio.ByteBuffer deepCopyToWriteOnlyBuffer(
      java.nio.ByteBuffer input) {
    java.nio.ByteBuffer copy = java.nio.ByteBuffer.allocate(input.capacity());
    int position = input.position();
    input.reset();
    int mark = input.position();
    int limit = input.limit();
    input.rewind();
    input.limit(input.capacity());
    copy.put(input);
    input.rewind();
    copy.rewind();
    input.position(mark);
    input.mark();
    copy.position(mark);
    copy.mark();
    input.position(position);
    copy.position(position);
    input.limit(limit);
    copy.limit(limit);
    return copy.asReadOnlyBuffer();
  }
  
  /**
   * RecordBuilder for Metadata instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Metadata>
    implements org.apache.avro.data.RecordBuilder<Metadata> {

    private java.nio.ByteBuffer __g__dirty;
    private int version;
    private java.util.Map<java.lang.CharSequence,java.lang.CharSequence> data;

    /** Creates a new Builder */
    private Builder() {
      super(org.apache.gora.examples.generated.Metadata.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.apache.gora.examples.generated.Metadata.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing Metadata instance */
    private Builder(org.apache.gora.examples.generated.Metadata other) {
            super(org.apache.gora.examples.generated.Metadata.SCHEMA$);
      if (isValidValue(fields()[0], other.__g__dirty)) {
        this.__g__dirty = (java.nio.ByteBuffer) data().deepCopy(fields()[0].schema(), other.__g__dirty);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.version)) {
        this.version = (java.lang.Integer) data().deepCopy(fields()[1].schema(), other.version);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.data)) {
        this.data = (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>) data().deepCopy(fields()[2].schema(), other.data);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'version' field */
    public java.lang.Integer getVersion() {
      return version;
    }
    
    /** Sets the value of the 'version' field */
    public org.apache.gora.examples.generated.Metadata.Builder setVersion(int value) {
      validate(fields()[1], value);
      this.version = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'version' field has been set */
    public boolean hasVersion() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'version' field */
    public org.apache.gora.examples.generated.Metadata.Builder clearVersion() {
      fieldSetFlags()[1] = false;
      return this;
    }
    
    /** Gets the value of the 'data' field */
    public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getData() {
      return data;
    }
    
    /** Sets the value of the 'data' field */
    public org.apache.gora.examples.generated.Metadata.Builder setData(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
      validate(fields()[2], value);
      this.data = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'data' field has been set */
    public boolean hasData() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'data' field */
    public org.apache.gora.examples.generated.Metadata.Builder clearData() {
      data = null;
      fieldSetFlags()[2] = false;
      return this;
    }
    
    @Override
    public Metadata build() {
      try {
        Metadata record = new Metadata();
        record.__g__dirty = fieldSetFlags()[0] ? this.__g__dirty : (java.nio.ByteBuffer) defaultValue(fields()[0]);
        record.version = fieldSetFlags()[1] ? this.version : (java.lang.Integer) defaultValue(fields()[1]);
        record.data = fieldSetFlags()[2] ? this.data : (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
  
  public Metadata.Tombstone getTombstone(){
  	return TOMBSTONE;
  }

  private static final Tombstone TOMBSTONE = new Tombstone();
  
  public static final class Tombstone extends Metadata implements org.apache.gora.persistency.Tombstone {
  
      private Tombstone() { }
  
	  				  /**
	   * Gets the value of the 'version' field.
		   */
	  public java.lang.Integer getVersion() {
	    throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
	  }
	
	  /**
	   * Sets the value of the 'version' field.
		   * @param value the value to set.
	   */
	  public void setVersion(java.lang.Integer value) {
	    throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
	  }
	  
	  /**
	   * Checks the dirty status of the 'version' field. A field is dirty if it represents a change that has not yet been written to the database.
		   * @param value the value to set.
	   */
	  public boolean isVersionDirty(java.lang.Integer value) {
	    throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
	  }
	
				  /**
	   * Gets the value of the 'data' field.
		   */
	  public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getData() {
	    throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
	  }
	
	  /**
	   * Sets the value of the 'data' field.
		   * @param value the value to set.
	   */
	  public void setData(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
	    throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
	  }
	  
	  /**
	   * Checks the dirty status of the 'data' field. A field is dirty if it represents a change that has not yet been written to the database.
		   * @param value the value to set.
	   */
	  public boolean isDataDirty(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
	    throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
	  }
	
		  
  }
  
}