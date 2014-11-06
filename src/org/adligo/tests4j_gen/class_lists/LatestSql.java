package org.adligo.tests4j_gen.class_lists;

import java.sql.Array;
import java.sql.BatchUpdateException;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.ClientInfoStatus;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DataTruncation;
import java.sql.DatabaseMetaData;
import java.sql.Date;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.DriverPropertyInfo;
import java.sql.NClob;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.PseudoColumnUsage;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.RowIdLifetime;
import java.sql.SQLClientInfoException;
import java.sql.SQLData;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.sql.SQLInput;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLInvalidAuthorizationSpecException;
import java.sql.SQLNonTransientConnectionException;
import java.sql.SQLOutput;
import java.sql.SQLPermission;
import java.sql.SQLRecoverableException;
import java.sql.SQLSyntaxErrorException;
import java.sql.SQLTimeoutException;
import java.sql.SQLTransactionRollbackException;
import java.sql.SQLTransientConnectionException;
import java.sql.SQLTransientException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.sql.Time;
import java.sql.Timestamp;
import java.sql.Types;
import java.sql.Wrapper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LatestSql extends BaseClassNameList {
  public static final List<Class<?>> CLASSES = getClasses();
  
  public static void addNames(List<String> names) {
    addNames(names, CLASSES);
  }
  
  public static final List<Class<?>> getClasses() {
    List<Class<?>> toRet = new ArrayList<Class<?>>();
    toRet.add( Array.class);
    toRet.add( Blob.class);
    toRet.add( CallableStatement.class);
    
    toRet.add( Clob.class);
    toRet.add( Connection.class);
    
    toRet.add( DatabaseMetaData.class);
    toRet.add( Driver.class);
    
    toRet.add( NClob.class);
    
    toRet.add( ParameterMetaData.class);
    toRet.add( PreparedStatement.class);
    
    toRet.add( Ref.class);
    toRet.add( ResultSet.class);
    toRet.add( ResultSetMetaData.class);
    toRet.add( RowId.class);
    
    toRet.add( Savepoint.class);
    toRet.add( SQLData.class);
    toRet.add( SQLInput.class);
    toRet.add( SQLOutput.class);
    toRet.add( SQLXML.class);
    toRet.add( Statement.class);
    toRet.add( Struct.class);
    
    toRet.add( Wrapper.class);
    //classes
    toRet.add( Date.class);
    toRet.add( DriverManager.class);
    toRet.add( DriverPropertyInfo.class);
    
    toRet.add( SQLPermission.class);
    
    toRet.add( Time.class);
    toRet.add( Timestamp.class);
    toRet.add( Types.class);
    
    //enums
    toRet.add( ClientInfoStatus.class);
    toRet.add( PseudoColumnUsage.class);
    toRet.add( RowIdLifetime.class);
    
    //exception
    toRet.add( BatchUpdateException.class);
    toRet.add( DataTruncation.class);
    
    toRet.add( SQLClientInfoException.class);
    toRet.add( SQLDataException.class);
    toRet.add( SQLException.class);
    toRet.add( SQLFeatureNotSupportedException.class);
    toRet.add( SQLIntegrityConstraintViolationException.class);
    toRet.add( SQLInvalidAuthorizationSpecException.class);
    toRet.add( SQLNonTransientConnectionException.class);
    toRet.add( SQLRecoverableException.class);
    toRet.add( SQLSyntaxErrorException.class);
    toRet.add( SQLTimeoutException.class);
    toRet.add( SQLTransactionRollbackException.class);
    toRet.add( SQLTransientConnectionException.class);
    toRet.add( SQLTransientException.class);
    toRet.add( SQLWarning.class);
    
    return Collections.unmodifiableList(toRet);
  }
}
