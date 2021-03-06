package model.data_structures;


import java.util.Date;

public class Comparendo implements Comparable<Comparendo>
{
	private int objectId;
	private Date fecha_hora;
	private String des_infrac;
	private String medio_dete;
	private String clase_vehi;
	private String tipo_servi;
	private String infraccion;
	private String localidad;

	private double latitud;
	private double longitud;



	public Comparendo(int objeId, Date fecha, String descripcion, String detencion, String claseVeh, String tipoSer, String codInfraccion, String localidadP, double lonP, double latP)
	{
		objectId = objeId;
		fecha_hora = fecha;
		des_infrac = descripcion;
		medio_dete = detencion;
		clase_vehi = claseVeh;
		tipo_servi = tipoSer;
		infraccion = codInfraccion;
		localidad = localidadP;
		longitud = lonP;
		latitud = latP;
	}
	
	public String darCarro()
	{
		return clase_vehi;
	}
	
	public double darLatitud()
	{
		return latitud;
	}
	
	public int darObjec()
	{
		return objectId;
	}

	//	OBJECTID, FECHA_HORA, INFRACCION, CLASE_VEHI, TIPO_SERVI, LOCALIDAD
	public String darInformacion()
	{
		return "[OBJECTID: " + objectId+ ", FECHA_HORA,: " + fecha_hora + ", LOCALIDAD: " + localidad + ", INFRACCION: "+ infraccion + "]";
	}
	
	public String darDatos()
	{
		return "[OBJECTID: " + objectId+ ", FECHA_HORA,: " + fecha_hora + ", TIPO_SERVI: " + tipo_servi + ", CLASE_VEHI: "+ clase_vehi + ", INFRACCION: "+ infraccion + "]";
	}

	@Override
	public String toString() {
		return "Comparendo [OBJECTID=" + objectId + ", FECHA_HORA=" + fecha_hora + ", DES_INFRAC=" + des_infrac
				+ ", MEDIO_DETE=" + medio_dete + ", CLASE_VEHI=" + clase_vehi + ", TIPO_SERVI=" + tipo_servi
				+ ", INFRACCION=" + infraccion + ", LOCALIDAD=" + localidad + ", latitud=" + latitud + ", longitud="
				+ longitud + "]";
	}

	@Override
	public int compareTo(Comparendo arg) 
	{
		int valor = 101;

		if(this.darObjec()>arg.darObjec())
		{
			valor = 1;
		}
		else if(this.darObjec()<arg.darObjec())
		{
			valor = -1;
		}
		else if(this.darObjec()==arg.darObjec())
		{
			valor = 0;
		}

		return valor;
	}
}
