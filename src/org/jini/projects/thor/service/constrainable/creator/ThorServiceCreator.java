/*
   Copyright 2006 thor.jini.org Project

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

*/

/*
 * thor : org.jini.projects.thor.service
 * 
 * 
 * ThorServiceCreator.java
 * Created on 02-Jan-2004
 * 
 * ThorServiceCreator
 *
 */
package org.jini.projects.thor.service.constrainable.creator;

import java.rmi.Remote;

import net.jini.id.Uuid;

import org.jini.glyph.chalice.builder.ProxyCreator;
import org.jini.projects.thor.service.ThorAdmin;
import org.jini.projects.thor.service.ThorService;
import org.jini.projects.thor.service.ThorSession;
import org.jini.projects.thor.service.constrainable.AdminProxy;
import org.jini.projects.thor.service.constrainable.ThorServiceProxy;
import org.jini.projects.thor.service.constrainable.ThorSessionProxy;


/**
 * @author calum
 */
public class ThorServiceCreator implements ProxyCreator{

    /**
     * 
     */
    public ThorServiceCreator() {
        super();
        // URGENT Complete constructor stub for ThorServiceCreator
    }

  
    /* @see utilities20.export.builder.ProxyCreator#create(java.rmi.Remote, net.jini.id.Uuid)
     */
    public Remote create(Remote in, Uuid ID) {
        // TODO Complete method stub for create
        if(in instanceof ThorService)
        	return ThorServiceProxy.create((ThorService) in, ID);
        if (in instanceof ThorAdmin)
            return AdminProxy.create((ThorAdmin) in, ID);
        if (in instanceof ThorSession)
            return ThorSessionProxy.create((ThorSession) in, ID);
        return null;
    }
}
