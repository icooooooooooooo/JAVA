package pr0304Barracks.contracts;

import jdk.jshell.spi.ExecutionControl;

import java.lang.reflect.InvocationTargetException;
import java.security.InvalidKeyException;

public interface Executable {

	String execute() throws NoSuchMethodException, IllegalAccessException, InstantiationException, ExecutionControl.NotImplementedException, InvocationTargetException, ClassNotFoundException, InvalidKeyException;

}
