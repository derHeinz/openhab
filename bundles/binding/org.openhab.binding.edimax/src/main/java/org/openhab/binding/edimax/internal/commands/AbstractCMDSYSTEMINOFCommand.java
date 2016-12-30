/**
 * Copyright (c) 2010-2016, openHAB.org and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.edimax.internal.commands;

import java.util.List;

/**
 * Base class for Commands of type SYSTEM_INFO.
 *
 * @author Heinz
 * @since 1.9.0
 *
 * @param <T>
 */
public abstract class AbstractCMDSYSTEMINOFCommand<T> extends AbstractCMDCommand<T> {

    @Override
    protected List<String> getPath() {
        List<String> list = super.getPath();
        list.add("SYSTEM_INFO");
        return list;
    }

}