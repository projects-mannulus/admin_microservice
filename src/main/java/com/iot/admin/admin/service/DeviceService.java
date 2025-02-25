package com.iot.admin.admin.service;

import java.util.List;
import java.util.Map;

import com.iot.admin.admin.dto.DeviceDetailDTO;
import com.iot.admin.admin.dto.DeviceForm;
import com.iot.admin.admin.dto.DeviceResourcePropertyForm;
import com.iot.admin.admin.dto.PropertyDetails;
import com.iot.admin.admin.dto.PropertyForm;

import org.springframework.data.domain.Page;

public interface DeviceService {    

    /**
     * Saves a new device data in database
     * 
     * @param formData device data to save
     */
    DeviceDetailDTO create(DeviceForm formData);


    /**
     * 
     *Return list of devices created by pagination
     *@return
    */
    Page<DeviceDetailDTO> paginate(Map<String,String> params);

    /**
     * 
     *Return list of devices created
     *@return {@link DeviceDetailDTO}
    */
    List<DeviceDetailDTO> findAll();

    /**
     * Returns a device by ID.
     * @return
     */
    DeviceDetailDTO findById(Long id);

    /**
     * 
     * @param fromData data from form
     * @param id is the current device id
     */
    DeviceDetailDTO update(DeviceForm fromData, Long id);

    /**
     * Delete a device by id from database. Throws a exception if it doesn't 
     * exist.
     * 
     * @param id the device id.
     * @return True or false
     */
    boolean delete(Long id);


    /**
     * Add resource to device
     * 
     * @param device_id the device id.
     * @param fromData data from form
     * @return True or false
     */
    boolean addResource(DeviceResourcePropertyForm form,Long device_id);    

    /**
     * Delete resource to device
     * 
     * @param device_id the device id.
     * @param fromData data from form
     * @return True or false
     */
    boolean deleteResource(DeviceResourcePropertyForm form,Long device_id);

    /**
     * Add property to device
     * 
     * @param device_id the device id.
     * @param fromData data from form
     * @return True or false
     */
    PropertyDetails addProperty(PropertyForm form,Long device_id);

     /**
     * Delete property to device
     * 
     * @param device_id the device id.
     * @param fromData data from form
     * @return True or false
     */
    boolean deleteProperty(DeviceResourcePropertyForm form,Long device_id);





}
