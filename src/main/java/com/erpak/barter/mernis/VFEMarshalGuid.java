package com.erpak.barter.mernis;

//------------------------------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 8.0.1.0
//
// Created by Quasar Development 
//
// This class has been generated for test purposes only and cannot be used in any commercial project.
// To use it in commercial project, you need to generate this class again with Premium account.
// Check https://EasyWsdl.com/Payment/PremiumAccountDetails to see all benefits of Premium account.
//
// Licence: CF3C92713BEF675D078000D6CF696ABB0DF13571D12D6CB345EFE1CB89BC2D692FCBB5006E47511684DB5A7415494C96CACFC277D458CE1475C951E444322B04
//------------------------------------------------------------------------

import org.ksoap2.serialization.Marshal;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import java.io.IOException;
import java.util.UUID;


public class VFEMarshalGuid implements Marshal
{
    public java.lang.Object readInstance(XmlPullParser parser, java.lang.String namespace, java.lang.String name,PropertyInfo expected) throws IOException, XmlPullParserException
    {
        return UUID.fromString(parser.nextText());
    }

    public void register(SoapSerializationEnvelope cm)
    {
        cm.addMapping(cm.xsd, "guid", UUID.class, this);
    }

    public void writeInstance(XmlSerializer writer, java.lang.Object obj) throws IOException
    {
        writer.text(obj.toString());
    }
}
