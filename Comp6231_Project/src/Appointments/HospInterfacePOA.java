package Appointments;


/**
* Appointments/HospInterfacePOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Appointments.idl
* Saturday, 26 March, 2022 4:16:36 PM EDT
*/

public abstract class HospInterfacePOA extends org.omg.PortableServer.Servant
 implements Appointments.HospInterfaceOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("addAppoint", new java.lang.Integer (0));
    _methods.put ("removeAppoint", new java.lang.Integer (1));
    _methods.put ("listAppointAvailability", new java.lang.Integer (2));
    _methods.put ("bookAppoint", new java.lang.Integer (3));
    _methods.put ("cancelAppoint", new java.lang.Integer (4));
    _methods.put ("getBookingSchedule", new java.lang.Integer (5));
    _methods.put ("swapAppoint", new java.lang.Integer (6));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // Appointments/HospInterface/addAppoint
       {
         String id = in.read_string ();
         String appointId = in.read_string ();
         String appointType = in.read_string ();
         String capacity = in.read_string ();
         String $result = null;
         $result = this.addAppoint (id, appointId, appointType, capacity);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 1:  // Appointments/HospInterface/removeAppoint
       {
         String id = in.read_string ();
         String appointId = in.read_string ();
         String appointType = in.read_string ();
         String $result = null;
         $result = this.removeAppoint (id, appointId, appointType);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 2:  // Appointments/HospInterface/listAppointAvailability
       {
         String id = in.read_string ();
         String appointType = in.read_string ();
         String $result = null;
         $result = this.listAppointAvailability (id, appointType);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 3:  // Appointments/HospInterface/bookAppoint
       {
         String id = in.read_string ();
         String appointId = in.read_string ();
         String appointType = in.read_string ();
         String $result = null;
         $result = this.bookAppoint (id, appointId, appointType);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 4:  // Appointments/HospInterface/cancelAppoint
       {
         String id = in.read_string ();
         String appointId = in.read_string ();
         String appointType = in.read_string ();
         String $result = null;
         $result = this.cancelAppoint (id, appointId, appointType);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 5:  // Appointments/HospInterface/getBookingSchedule
       {
         String id = in.read_string ();
         String $result = null;
         $result = this.getBookingSchedule (id);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 6:  // Appointments/HospInterface/swapAppoint
       {
         String id = in.read_string ();
         String newAppointId = in.read_string ();
         String newAppointType = in.read_string ();
         String oldAppointId = in.read_string ();
         String oldAppointType = in.read_string ();
         String $result = null;
         $result = this.swapAppoint (id, newAppointId, newAppointType, oldAppointId, oldAppointType);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:Appointments/HospInterface:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public HospInterface _this() 
  {
    return HospInterfaceHelper.narrow(
    super._this_object());
  }

  public HospInterface _this(org.omg.CORBA.ORB orb) 
  {
    return HospInterfaceHelper.narrow(
    super._this_object(orb));
  }


} // class HospInterfacePOA