package org.slive.tr069.model.struct;

/**
 * TODO Add class comment here<p/>
 * @version 1.0.0
 * @since 1.0.0
 * @author Slive
 * @history<br/>
 * ver date author desc
 * 1.0.0 2013-05-21 Slive created<br/>
 * <p/>
 */
public final class ParameterValueStructObject extends ParameterValueStruct<Object>
{
    private static final long serialVersionUID = 8230721944738939224L;

    public ParameterValueStructObject(String name, Object value)
    {
        super(name, value, Type_Object);
    }
}
