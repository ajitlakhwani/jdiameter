/*
 * JBoss, Home of Professional Open Source
 * Copyright 2006, Red Hat, Inc. and individual contributors
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

package org.jdiameter.api;

/**
 * The NoRouteException signals that no route exist for a given realm.
 * 
 * @author erick.svenson@yahoo.com
 * @version 1.5.1 Final
 */
public class RouteException extends Exception {

  private static final long serialVersionUID = 1L;

  /**
   * Constructor with reason string
   * @param message reason string
   */
  public RouteException(String message) {
    super(message);
  }

  /**
   * Constructor with reason string and parent exception
   * @param message message reason string
   * @param cause parent exception
   */
  public RouteException(String message, Throwable cause) {
    super(message, cause);
  }
}
