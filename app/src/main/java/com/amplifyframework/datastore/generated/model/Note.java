//package com.amplifyframework.datastore.generated.model;
//
//import com.amplifyframework.core.model.temporal.Temporal;
//
//import java.util.List;
//import java.util.UUID;
//import java.util.Objects;
//
//import androidx.core.util.ObjectsCompat;
//
//import com.amplifyframework.core.model.Model;
//import com.amplifyframework.core.model.annotations.Index;
//import com.amplifyframework.core.model.annotations.ModelConfig;
//import com.amplifyframework.core.model.annotations.ModelField;
//import com.amplifyframework.core.model.query.predicate.QueryField;
//
//import static com.amplifyframework.core.model.query.predicate.QueryField.field;
//
///** This is an auto generated class representing the Note type in your schema. */
//@SuppressWarnings("all")
//@ModelConfig(pluralName = "Notes")
//public final class Note implements Model {
//  public static final QueryField ID = field("Note", "id");
//  public static final QueryField TEST = field("Note", "test");
//<<<<<<< HEAD
//  public static final QueryField CONTENT = field("Note", "content");
//  private final @ModelField(targetType="ID", isRequired = true) String id;
//  private final @ModelField(targetType="String") String test;
//=======
//  public static final QueryField TEST2 = field("Note", "test2");
//  public static final QueryField CONTENT = field("Note", "content");
//  private final @ModelField(targetType="ID", isRequired = true) String id;
//  private final @ModelField(targetType="String") String test;
//  private final @ModelField(targetType="String") String test2;
//>>>>>>> 687ed4180259537c2748835561b52a4908b91bc9
//  private final @ModelField(targetType="String", isRequired = true) String content;
//  private @ModelField(targetType="AWSDateTime", isReadOnly = true) Temporal.DateTime createdAt;
//  private @ModelField(targetType="AWSDateTime", isReadOnly = true) Temporal.DateTime updatedAt;
//  public String getId() {
//      return id;
//  }
//
//  public String getTest() {
//      return test;
//  }
//
//<<<<<<< HEAD
//=======
//  public String getTest2() {
//      return test2;
//  }
//
//>>>>>>> 687ed4180259537c2748835561b52a4908b91bc9
//  public String getContent() {
//      return content;
//  }
//
//  public Temporal.DateTime getCreatedAt() {
//      return createdAt;
//  }
//
//  public Temporal.DateTime getUpdatedAt() {
//      return updatedAt;
//  }
//
//<<<<<<< HEAD
//  private Note(String id, String test, String content) {
//    this.id = id;
//    this.test = test;
//=======
//  private Note(String id, String test, String test2, String content) {
//    this.id = id;
//    this.test = test;
//    this.test2 = test2;
//>>>>>>> 687ed4180259537c2748835561b52a4908b91bc9
//    this.content = content;
//  }
//
//  @Override
//   public boolean equals(Object obj) {
//      if (this == obj) {
//        return true;
//      } else if(obj == null || getClass() != obj.getClass()) {
//        return false;
//      } else {
//      Note note = (Note) obj;
//      return ObjectsCompat.equals(getId(), note.getId()) &&
//              ObjectsCompat.equals(getTest(), note.getTest()) &&
//<<<<<<< HEAD
//=======
//              ObjectsCompat.equals(getTest2(), note.getTest2()) &&
//>>>>>>> 687ed4180259537c2748835561b52a4908b91bc9
//              ObjectsCompat.equals(getContent(), note.getContent()) &&
//              ObjectsCompat.equals(getCreatedAt(), note.getCreatedAt()) &&
//              ObjectsCompat.equals(getUpdatedAt(), note.getUpdatedAt());
//      }
//  }
//
//  @Override
//   public int hashCode() {
//    return new StringBuilder()
//      .append(getId())
//      .append(getTest())
//<<<<<<< HEAD
//=======
//      .append(getTest2())
//>>>>>>> 687ed4180259537c2748835561b52a4908b91bc9
//      .append(getContent())
//      .append(getCreatedAt())
//      .append(getUpdatedAt())
//      .toString()
//      .hashCode();
//  }
//
//  @Override
//   public String toString() {
//    return new StringBuilder()
//      .append("Note {")
//      .append("id=" + String.valueOf(getId()) + ", ")
//      .append("test=" + String.valueOf(getTest()) + ", ")
//<<<<<<< HEAD
//=======
//      .append("test2=" + String.valueOf(getTest2()) + ", ")
//>>>>>>> 687ed4180259537c2748835561b52a4908b91bc9
//      .append("content=" + String.valueOf(getContent()) + ", ")
//      .append("createdAt=" + String.valueOf(getCreatedAt()) + ", ")
//      .append("updatedAt=" + String.valueOf(getUpdatedAt()))
//      .append("}")
//      .toString();
//  }
//
//  public static ContentStep builder() {
//      return new Builder();
//  }
//
//  /**
//   * WARNING: This method should not be used to build an instance of this object for a CREATE mutation.
//   * This is a convenience method to return an instance of the object with only its ID populated
//   * to be used in the context of a parameter in a delete mutation or referencing a foreign key
//   * in a relationship.
//   * @param id the id of the existing item this instance will represent
//   * @return an instance of this model with only ID populated
//   * @throws IllegalArgumentException Checks that ID is in the proper format
//   */
//  public static Note justId(String id) {
//    try {
//      UUID.fromString(id); // Check that ID is in the UUID format - if not an exception is thrown
//    } catch (Exception exception) {
//      throw new IllegalArgumentException(
//              "Model IDs must be unique in the format of UUID. This method is for creating instances " +
//              "of an existing object with only its ID field for sending as a mutation parameter. When " +
//              "creating a new object, use the standard builder method and leave the ID field blank."
//      );
//    }
//    return new Note(
//      id,
//      null,
//<<<<<<< HEAD
//=======
//      null,
//>>>>>>> 687ed4180259537c2748835561b52a4908b91bc9
//      null
//    );
//  }
//
//  public CopyOfBuilder copyOfBuilder() {
//    return new CopyOfBuilder(id,
//      test,
//<<<<<<< HEAD
//=======
//      test2,
//>>>>>>> 687ed4180259537c2748835561b52a4908b91bc9
//      content);
//  }
//  public interface ContentStep {
//    BuildStep content(String content);
//  }
//
//
//  public interface BuildStep {
//    Note build();
//    BuildStep id(String id) throws IllegalArgumentException;
//    BuildStep test(String test);
//<<<<<<< HEAD
//=======
//    BuildStep test2(String test2);
//>>>>>>> 687ed4180259537c2748835561b52a4908b91bc9
//  }
//
//
//  public static class Builder implements ContentStep, BuildStep {
//    private String id;
//    private String content;
//    private String test;
//<<<<<<< HEAD
//=======
//    private String test2;
//>>>>>>> 687ed4180259537c2748835561b52a4908b91bc9
//    @Override
//     public Note build() {
//        String id = this.id != null ? this.id : UUID.randomUUID().toString();
//
//        return new Note(
//          id,
//          test,
//<<<<<<< HEAD
//=======
//          test2,
//>>>>>>> 687ed4180259537c2748835561b52a4908b91bc9
//          content);
//    }
//
//    @Override
//     public BuildStep content(String content) {
//        Objects.requireNonNull(content);
//        this.content = content;
//        return this;
//    }
//
//    @Override
//     public BuildStep test(String test) {
//        this.test = test;
//        return this;
//    }
//
//<<<<<<< HEAD
//    /**
//     * @param id id
//     * @return Current Builder instance, for fluent method chaining
//     */
//    public BuildStep id(String id) {
//        this.id = id;
//=======
//    @Override
//     public BuildStep test2(String test2) {
//        this.test2 = test2;
//        return this;
//    }
//
//    /**
//     * WARNING: Do not set ID when creating a new object. Leave this blank and one will be auto generated for you.
//     * This should only be set when referring to an already existing object.
//     * @param id id
//     * @return Current Builder instance, for fluent method chaining
//     * @throws IllegalArgumentException Checks that ID is in the proper format
//     */
//    public BuildStep id(String id) throws IllegalArgumentException {
//        this.id = id;
//
//        try {
//            UUID.fromString(id); // Check that ID is in the UUID format - if not an exception is thrown
//        } catch (Exception exception) {
//          throw new IllegalArgumentException("Model IDs must be unique in the format of UUID.",
//                    exception);
//        }
//
//>>>>>>> 687ed4180259537c2748835561b52a4908b91bc9
//        return this;
//    }
//  }
//
//
//  public final class CopyOfBuilder extends Builder {
//<<<<<<< HEAD
//    private CopyOfBuilder(String id, String test, String content) {
//      super.id(id);
//      super.content(content)
//        .test(test);
//=======
//    private CopyOfBuilder(String id, String test, String test2, String content) {
//      super.id(id);
//      super.content(content)
//        .test(test)
//        .test2(test2);
//>>>>>>> 687ed4180259537c2748835561b52a4908b91bc9
//    }
//
//    @Override
//     public CopyOfBuilder content(String content) {
//      return (CopyOfBuilder) super.content(content);
//    }
//
//    @Override
//     public CopyOfBuilder test(String test) {
//      return (CopyOfBuilder) super.test(test);
//    }
//<<<<<<< HEAD
//=======
//
//    @Override
//     public CopyOfBuilder test2(String test2) {
//      return (CopyOfBuilder) super.test2(test2);
//    }
//>>>>>>> 687ed4180259537c2748835561b52a4908b91bc9
//  }
//
//}
