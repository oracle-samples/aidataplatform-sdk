# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class DriverConfig(object):
    """
    Driver configuration.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new DriverConfig object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param driver_node_type:
            The value to assign to the driver_node_type property of this DriverConfig.
        :type driver_node_type: str

        :param driver_shape:
            The value to assign to the driver_shape property of this DriverConfig.
        :type driver_shape: str

        :param driver_shape_config:
            The value to assign to the driver_shape_config property of this DriverConfig.
        :type driver_shape_config: oci.aidataplatform_dp.models.ShapeConfig

        """
        self.swagger_types = {
            'driver_node_type': 'str',
            'driver_shape': 'str',
            'driver_shape_config': 'ShapeConfig'
        }

        self.attribute_map = {
            'driver_node_type': 'driverNodeType',
            'driver_shape': 'driverShape',
            'driver_shape_config': 'driverShapeConfig'
        }

        self._driver_node_type = None
        self._driver_shape = None
        self._driver_shape_config = None

    @property
    def driver_node_type(self):
        """
        Gets the driver_node_type of this DriverConfig.
        Node type of optional driver node that encodes the driver node shape and associated resources.


        :return: The driver_node_type of this DriverConfig.
        :rtype: str
        """
        return self._driver_node_type

    @driver_node_type.setter
    def driver_node_type(self, driver_node_type):
        """
        Sets the driver_node_type of this DriverConfig.
        Node type of optional driver node that encodes the driver node shape and associated resources.


        :param driver_node_type: The driver_node_type of this DriverConfig.
        :type: str
        """
        self._driver_node_type = driver_node_type

    @property
    def driver_shape(self):
        """
        Gets the driver_shape of this DriverConfig.
        Shape of compute cluster driver instance. Example - VM.Standard2.x, VM.Standard.E3.Flex


        :return: The driver_shape of this DriverConfig.
        :rtype: str
        """
        return self._driver_shape

    @driver_shape.setter
    def driver_shape(self, driver_shape):
        """
        Sets the driver_shape of this DriverConfig.
        Shape of compute cluster driver instance. Example - VM.Standard2.x, VM.Standard.E3.Flex


        :param driver_shape: The driver_shape of this DriverConfig.
        :type: str
        """
        self._driver_shape = driver_shape

    @property
    def driver_shape_config(self):
        """
        Gets the driver_shape_config of this DriverConfig.

        :return: The driver_shape_config of this DriverConfig.
        :rtype: oci.aidataplatform_dp.models.ShapeConfig
        """
        return self._driver_shape_config

    @driver_shape_config.setter
    def driver_shape_config(self, driver_shape_config):
        """
        Sets the driver_shape_config of this DriverConfig.

        :param driver_shape_config: The driver_shape_config of this DriverConfig.
        :type: oci.aidataplatform_dp.models.ShapeConfig
        """
        self._driver_shape_config = driver_shape_config

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
