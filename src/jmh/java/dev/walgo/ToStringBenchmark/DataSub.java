package dev.walgo.ToStringBenchmark;

import com.google.common.base.MoreObjects;
import java.math.BigDecimal;
import java.util.Objects;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class DataSub {
  public int var1;
  public String var2;
  public BigDecimal var3;

  public DataSub() {
    this.var1 = 434;
    this.var2 = "sub test";
    this.var3 = BigDecimal.TEN;
  }


  public String toString_Simple() {
    return "DataSub{" + "var1=" + var1 + ", var2=" + var2 + ", var3=" + var3 + '}';
  }

  public String toString_Objects() {
    return "DataSub{"
        + "var1="
        + Objects.toString(var1)
        + ", var2="
        + Objects.toString(var2)
        + ", var3="
        + Objects.toString(var3)
        + '}';
  }

  public String toString_StringBuilder() {
    final StringBuilder sb = new StringBuilder("DataSub{");
    sb.append("var1='").append(var1).append('\'');
    sb.append(",var2='").append(var2).append('\'');
    sb.append(",var3='").append(var3).append('\'');

    sb.append(super.toString());
    return sb.toString();
  }

  public String toString_Guava() {
    return MoreObjects.toStringHelper(this)
        .add("var1", var1)
        .add("var2", var2)
        .add("var3", var3)
        .toString();
  }

  public String toString_Apache() {
    return new ToStringBuilder(this)
        .append("var1", var1)
        .append("var2", var2)
        .append("var3", var3)
        .toString();
  }

  public String toString_ApacheReflection() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
  }

  public String toString_ApacheReflectionBuilder() {
    return ReflectionToStringBuilder.toString(this);
  }
}