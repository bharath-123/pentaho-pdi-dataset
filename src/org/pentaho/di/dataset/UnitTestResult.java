package org.pentaho.di.dataset;

import java.util.ArrayList;
import java.util.List;

import org.pentaho.di.core.row.RowDataUtil;
import org.pentaho.di.core.row.RowMeta;
import org.pentaho.di.core.row.RowMetaInterface;
import org.pentaho.di.core.row.value.ValueMetaBoolean;
import org.pentaho.di.core.row.value.ValueMetaString;
import org.pentaho.di.i18n.BaseMessages;

public class UnitTestResult {
  private static final Class<?> PKG = UnitTestResult.class; // For i18n

  private String transformationName;
  private String unitTestName;
  private String dataSetName;
  private String stepName;
  private boolean error;
  private String comment;

  public UnitTestResult() {
    super();
  }

  public UnitTestResult(String transformationName, String unitTestName, String dataSetName, String stepName, boolean error, String comment) {
    super();
    this.transformationName = transformationName;
    this.unitTestName = unitTestName;
    this.dataSetName = dataSetName;
    this.stepName = stepName;
    this.error = error;
    this.comment = comment;
  }

  public String getTransformationName() {
    return transformationName;
  }

  public void setTransformationName(String transformationName) {
    this.transformationName = transformationName;
  }

  public String getUnitTestName() {
    return unitTestName;
  }

  public void setUnitTestName(String unitTestName) {
    this.unitTestName = unitTestName;
  }

  public String getDataSetName() {
    return dataSetName;
  }

  public void setDataSetName(String dataSetName) {
    this.dataSetName = dataSetName;
  }

  public String getStepName() {
    return stepName;
  }

  public void setStepName(String stepName) {
    this.stepName = stepName;
  }

  public boolean isError() {
    return error;
  }

  public void setError(boolean error) {
    this.error = error;
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }
  
  public static final RowMetaInterface getRowMeta() {
    RowMetaInterface rowMeta = new RowMeta();
    
    rowMeta.addValueMeta(new ValueMetaString(BaseMessages.getString(PKG, "UnitTestResult.FieldName.TransformationName")));
    rowMeta.addValueMeta(new ValueMetaString(BaseMessages.getString(PKG, "UnitTestResult.FieldName.UnitTestName")));
    rowMeta.addValueMeta(new ValueMetaString(BaseMessages.getString(PKG, "UnitTestResult.FieldName.DataSetName")));
    rowMeta.addValueMeta(new ValueMetaString(BaseMessages.getString(PKG, "UnitTestResult.FieldName.StepName")));
    rowMeta.addValueMeta(new ValueMetaBoolean(BaseMessages.getString(PKG, "UnitTestResult.FieldName.Error")));
    rowMeta.addValueMeta(new ValueMetaString(BaseMessages.getString(PKG, "UnitTestResult.FieldName.Comment")));

    return rowMeta;
  }
  
  public static final List<Object[]> getRowData(List<UnitTestResult> results) {
    List<Object[]> rows = new ArrayList<Object[]>();
    RowMetaInterface rowMeta = getRowMeta();
    for (UnitTestResult result : results) {
      int index=0;
      Object[] row = RowDataUtil.allocateRowData(rowMeta.size());
      row[index++] = result.getTransformationName();
      row[index++] = result.getUnitTestName();
      row[index++] = result.getDataSetName();
      row[index++] = result.getStepName();
      row[index++] = result.isError();
      row[index++] = result.getComment();
      rows.add(row);
    }
    return rows;
  }

}
