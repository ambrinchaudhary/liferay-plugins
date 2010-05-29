/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.workflow.kaleo.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.workflow.kaleo.model.KaleoInstance;

import java.util.List;

/**
 * <a href="KaleoInstanceUtil.java.html"><b><i>View Source</i></b></a>
 *
 * <p>
 * ServiceBuilder generated this class. Modifications in this class will be
 * overwritten the next time is generated.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       KaleoInstancePersistence
 * @see       KaleoInstancePersistenceImpl
 * @generated
 */
public class KaleoInstanceUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(KaleoInstance)
	 */
	public static void clearCache(KaleoInstance kaleoInstance) {
		getPersistence().clearCache(kaleoInstance);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<KaleoInstance> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<KaleoInstance> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static KaleoInstance remove(KaleoInstance kaleoInstance)
		throws SystemException {
		return getPersistence().remove(kaleoInstance);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static KaleoInstance update(KaleoInstance kaleoInstance,
		boolean merge) throws SystemException {
		return getPersistence().update(kaleoInstance, merge);
	}

	public static void cacheResult(
		com.liferay.portal.workflow.kaleo.model.KaleoInstance kaleoInstance) {
		getPersistence().cacheResult(kaleoInstance);
	}

	public static void cacheResult(
		java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoInstance> kaleoInstances) {
		getPersistence().cacheResult(kaleoInstances);
	}

	public static com.liferay.portal.workflow.kaleo.model.KaleoInstance create(
		long kaleoInstanceId) {
		return getPersistence().create(kaleoInstanceId);
	}

	public static com.liferay.portal.workflow.kaleo.model.KaleoInstance remove(
		long kaleoInstanceId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchInstanceException {
		return getPersistence().remove(kaleoInstanceId);
	}

	public static com.liferay.portal.workflow.kaleo.model.KaleoInstance updateImpl(
		com.liferay.portal.workflow.kaleo.model.KaleoInstance kaleoInstance,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(kaleoInstance, merge);
	}

	public static com.liferay.portal.workflow.kaleo.model.KaleoInstance findByPrimaryKey(
		long kaleoInstanceId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchInstanceException {
		return getPersistence().findByPrimaryKey(kaleoInstanceId);
	}

	public static com.liferay.portal.workflow.kaleo.model.KaleoInstance fetchByPrimaryKey(
		long kaleoInstanceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(kaleoInstanceId);
	}

	public static java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoInstance> findByC_KDN_KDV_CD(
		long companyId, java.lang.String kaleoDefinitionName,
		int kaleoDefinitionVersion, java.util.Date completionDate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_KDN_KDV_CD(companyId, kaleoDefinitionName,
			kaleoDefinitionVersion, completionDate);
	}

	public static java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoInstance> findByC_KDN_KDV_CD(
		long companyId, java.lang.String kaleoDefinitionName,
		int kaleoDefinitionVersion, java.util.Date completionDate, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_KDN_KDV_CD(companyId, kaleoDefinitionName,
			kaleoDefinitionVersion, completionDate, start, end);
	}

	public static java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoInstance> findByC_KDN_KDV_CD(
		long companyId, java.lang.String kaleoDefinitionName,
		int kaleoDefinitionVersion, java.util.Date completionDate, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_KDN_KDV_CD(companyId, kaleoDefinitionName,
			kaleoDefinitionVersion, completionDate, start, end,
			orderByComparator);
	}

	public static com.liferay.portal.workflow.kaleo.model.KaleoInstance findByC_KDN_KDV_CD_First(
		long companyId, java.lang.String kaleoDefinitionName,
		int kaleoDefinitionVersion, java.util.Date completionDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchInstanceException {
		return getPersistence()
				   .findByC_KDN_KDV_CD_First(companyId, kaleoDefinitionName,
			kaleoDefinitionVersion, completionDate, orderByComparator);
	}

	public static com.liferay.portal.workflow.kaleo.model.KaleoInstance findByC_KDN_KDV_CD_Last(
		long companyId, java.lang.String kaleoDefinitionName,
		int kaleoDefinitionVersion, java.util.Date completionDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchInstanceException {
		return getPersistence()
				   .findByC_KDN_KDV_CD_Last(companyId, kaleoDefinitionName,
			kaleoDefinitionVersion, completionDate, orderByComparator);
	}

	public static com.liferay.portal.workflow.kaleo.model.KaleoInstance[] findByC_KDN_KDV_CD_PrevAndNext(
		long kaleoInstanceId, long companyId,
		java.lang.String kaleoDefinitionName, int kaleoDefinitionVersion,
		java.util.Date completionDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchInstanceException {
		return getPersistence()
				   .findByC_KDN_KDV_CD_PrevAndNext(kaleoInstanceId, companyId,
			kaleoDefinitionName, kaleoDefinitionVersion, completionDate,
			orderByComparator);
	}

	public static java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoInstance> findByKaleoDefinitionId(
		long kaleoDefinitionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByKaleoDefinitionId(kaleoDefinitionId);
	}

	public static java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoInstance> findByKaleoDefinitionId(
		long kaleoDefinitionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByKaleoDefinitionId(kaleoDefinitionId, start, end);
	}

	public static java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoInstance> findByKaleoDefinitionId(
		long kaleoDefinitionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByKaleoDefinitionId(kaleoDefinitionId, start, end,
			orderByComparator);
	}

	public static com.liferay.portal.workflow.kaleo.model.KaleoInstance findByKaleoDefinitionId_First(
		long kaleoDefinitionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchInstanceException {
		return getPersistence()
				   .findByKaleoDefinitionId_First(kaleoDefinitionId,
			orderByComparator);
	}

	public static com.liferay.portal.workflow.kaleo.model.KaleoInstance findByKaleoDefinitionId_Last(
		long kaleoDefinitionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchInstanceException {
		return getPersistence()
				   .findByKaleoDefinitionId_Last(kaleoDefinitionId,
			orderByComparator);
	}

	public static com.liferay.portal.workflow.kaleo.model.KaleoInstance[] findByKaleoDefinitionId_PrevAndNext(
		long kaleoInstanceId, long kaleoDefinitionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchInstanceException {
		return getPersistence()
				   .findByKaleoDefinitionId_PrevAndNext(kaleoInstanceId,
			kaleoDefinitionId, orderByComparator);
	}

	public static java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoInstance> findByCompleted_KDI(
		boolean completed, long kaleoDefinitionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompleted_KDI(completed, kaleoDefinitionId);
	}

	public static java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoInstance> findByCompleted_KDI(
		boolean completed, long kaleoDefinitionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompleted_KDI(completed, kaleoDefinitionId, start, end);
	}

	public static java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoInstance> findByCompleted_KDI(
		boolean completed, long kaleoDefinitionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompleted_KDI(completed, kaleoDefinitionId, start,
			end, orderByComparator);
	}

	public static com.liferay.portal.workflow.kaleo.model.KaleoInstance findByCompleted_KDI_First(
		boolean completed, long kaleoDefinitionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchInstanceException {
		return getPersistence()
				   .findByCompleted_KDI_First(completed, kaleoDefinitionId,
			orderByComparator);
	}

	public static com.liferay.portal.workflow.kaleo.model.KaleoInstance findByCompleted_KDI_Last(
		boolean completed, long kaleoDefinitionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchInstanceException {
		return getPersistence()
				   .findByCompleted_KDI_Last(completed, kaleoDefinitionId,
			orderByComparator);
	}

	public static com.liferay.portal.workflow.kaleo.model.KaleoInstance[] findByCompleted_KDI_PrevAndNext(
		long kaleoInstanceId, boolean completed, long kaleoDefinitionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchInstanceException {
		return getPersistence()
				   .findByCompleted_KDI_PrevAndNext(kaleoInstanceId, completed,
			kaleoDefinitionId, orderByComparator);
	}

	public static java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoInstance> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	public static java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoInstance> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	public static java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoInstance> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	public static void removeByC_KDN_KDV_CD(long companyId,
		java.lang.String kaleoDefinitionName, int kaleoDefinitionVersion,
		java.util.Date completionDate)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByC_KDN_KDV_CD(companyId, kaleoDefinitionName,
			kaleoDefinitionVersion, completionDate);
	}

	public static void removeByKaleoDefinitionId(long kaleoDefinitionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByKaleoDefinitionId(kaleoDefinitionId);
	}

	public static void removeByCompleted_KDI(boolean completed,
		long kaleoDefinitionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCompleted_KDI(completed, kaleoDefinitionId);
	}

	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	public static int countByC_KDN_KDV_CD(long companyId,
		java.lang.String kaleoDefinitionName, int kaleoDefinitionVersion,
		java.util.Date completionDate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByC_KDN_KDV_CD(companyId, kaleoDefinitionName,
			kaleoDefinitionVersion, completionDate);
	}

	public static int countByKaleoDefinitionId(long kaleoDefinitionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByKaleoDefinitionId(kaleoDefinitionId);
	}

	public static int countByCompleted_KDI(boolean completed,
		long kaleoDefinitionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByCompleted_KDI(completed, kaleoDefinitionId);
	}

	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static KaleoInstancePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (KaleoInstancePersistence)PortletBeanLocatorUtil.locate(com.liferay.portal.workflow.kaleo.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					KaleoInstancePersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(KaleoInstancePersistence persistence) {
		_persistence = persistence;
	}

	private static KaleoInstancePersistence _persistence;
}