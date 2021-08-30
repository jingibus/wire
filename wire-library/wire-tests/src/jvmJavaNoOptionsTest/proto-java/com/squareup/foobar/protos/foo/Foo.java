// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.foobar.Foo in foo.proto
package com.squareup.foobar.protos.foo;

import com.squareup.foobar.protos.bar.Bar;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Deprecated;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

@Deprecated
public final class Foo extends Message<Foo, Foo.Builder> {
  public static final ProtoAdapter<Foo> ADAPTER = new ProtoAdapter_Foo();

  private static final long serialVersionUID = 0L;

  @WireField(
      tag = 1,
      adapter = "com.squareup.foobar.protos.bar.Bar$Baz$Moo#ADAPTER"
  )
  public final Bar.Baz.Moo moo;

  public Foo(Bar.Baz.Moo moo) {
    this(moo, ByteString.EMPTY);
  }

  public Foo(Bar.Baz.Moo moo, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.moo = moo;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.moo = moo;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof Foo)) return false;
    Foo o = (Foo) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(moo, o.moo);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (moo != null ? moo.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (moo != null) builder.append(", moo=").append(moo);
    return builder.replace(0, 2, "Foo{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<Foo, Builder> {
    public Bar.Baz.Moo moo;

    public Builder() {
    }

    public Builder moo(Bar.Baz.Moo moo) {
      this.moo = moo;
      return this;
    }

    @Override
    public Foo build() {
      return new Foo(moo, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_Foo extends ProtoAdapter<Foo> {
    public ProtoAdapter_Foo() {
      super(FieldEncoding.LENGTH_DELIMITED, Foo.class, "type.googleapis.com/squareup.foobar.Foo", Syntax.PROTO_2, null, "foo.proto");
    }

    @Override
    public int encodedSize(Foo value) {
      int result = 0;
      result += Bar.Baz.Moo.ADAPTER.encodedSizeWithTag(1, value.moo);
      result += value.unknownFields().size();
      return result;
    }

    @Override
    public void encode(ProtoWriter writer, Foo value) throws IOException {
      Bar.Baz.Moo.ADAPTER.encodeWithTag(writer, 1, value.moo);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public void encode(ReverseProtoWriter writer, Foo value) throws IOException {
      writer.writeBytes(value.unknownFields());
      Bar.Baz.Moo.ADAPTER.encodeWithTag(writer, 1, value.moo);
    }

    @Override
    public Foo decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.moo(Bar.Baz.Moo.ADAPTER.decode(reader)); break;
          default: {
            reader.readUnknownField(tag);
          }
        }
      }
      builder.addUnknownFields(reader.endMessageAndGetUnknownFields(token));
      return builder.build();
    }

    @Override
    public Foo redact(Foo value) {
      Builder builder = value.newBuilder();
      if (builder.moo != null) builder.moo = Bar.Baz.Moo.ADAPTER.redact(builder.moo);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
