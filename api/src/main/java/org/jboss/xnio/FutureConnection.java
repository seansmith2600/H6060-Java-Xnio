/*
 * JBoss, Home of Professional Open Source
 * Copyright 2008, JBoss Inc., and individual contributors as indicated
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.jboss.xnio;

/**
 * Represents the future outcome of an in-progress connection operation.  The local endpoint address is only known after
 * the operation begins, but may be available before the operation completes.
 *
 * @param <A> the address type
 * @param <T> the channel type
 */
public interface FutureConnection<A, T> extends IoFuture<T> {
    /**
     * The local address of the future channel.
     *
     * @see org.jboss.xnio.channels.BoundChannel#getLocalAddress()
     *
     * @return the local address
     */
    A getLocalAddress();

    /** {@inheritDoc} */
    FutureConnection<A, T> cancel();
}
