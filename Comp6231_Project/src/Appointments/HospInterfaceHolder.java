package Appointments;

/**
* Appointments/HospInterfaceHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Appointments.idl
* Saturday, 26 March, 2022 4:16:36 PM EDT
*/

public final class HospInterfaceHolder implements org.omg.CORBA.portable.Streamable
{
  public Appointments.HospInterface value = null;

  public HospInterfaceHolder ()
  {
  }

  public HospInterfaceHolder (Appointments.HospInterface initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = Appointments.HospInterfaceHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    Appointments.HospInterfaceHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return Appointments.HospInterfaceHelper.type ();
  }

}
