# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.


from .model import Model
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AiModel(Model):
    """
    A Data Lake AiModel details
    """

    def __init__(self, **kwargs):
        """
        Initializes a new AiModel object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.AiModel.model_type` attribute
        of this class is ``GEN_AI`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param model_type:
            The value to assign to the model_type property of this AiModel.
            Allowed values for this property are: "GEN_AI"
        :type model_type: str

        :param id:
            The value to assign to the id property of this AiModel.
        :type id: str

        :param model_name:
            The value to assign to the model_name property of this AiModel.
        :type model_name: str

        :param display_name:
            The value to assign to the display_name property of this AiModel.
        :type display_name: str

        :param namespace_name:
            The value to assign to the namespace_name property of this AiModel.
        :type namespace_name: str

        :param description:
            The value to assign to the description property of this AiModel.
        :type description: str

        :param time_created:
            The value to assign to the time_created property of this AiModel.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this AiModel.
        :type time_updated: datetime

        :param created_by:
            The value to assign to the created_by property of this AiModel.
        :type created_by: str

        :param updated_by:
            The value to assign to the updated_by property of this AiModel.
        :type updated_by: str

        :param lifecycle_state:
            The value to assign to the lifecycle_state property of this AiModel.
            Allowed values for this property are: "ACTIVE", "CREATING", "DELETING", "DELETED", "FAILED"
        :type lifecycle_state: str

        :param lifecycle_details:
            The value to assign to the lifecycle_details property of this AiModel.
        :type lifecycle_details: str

        :param model_capabilities:
            The value to assign to the model_capabilities property of this AiModel.
        :type model_capabilities: list[oci.aidataplatform_dp.models.AiModelCapabilitiesEnum]

        :param model_version:
            The value to assign to the model_version property of this AiModel.
        :type model_version: str

        :param vendor:
            The value to assign to the vendor property of this AiModel.
        :type vendor: str

        :param region_id:
            The value to assign to the region_id property of this AiModel.
        :type region_id: str

        """
        self.swagger_types = {
            'model_type': 'str',
            'id': 'str',
            'model_name': 'str',
            'display_name': 'str',
            'namespace_name': 'str',
            'description': 'str',
            'time_created': 'datetime',
            'time_updated': 'datetime',
            'created_by': 'str',
            'updated_by': 'str',
            'lifecycle_state': 'str',
            'lifecycle_details': 'str',
            'model_capabilities': 'list[AiModelCapabilitiesEnum]',
            'model_version': 'str',
            'vendor': 'str',
            'region_id': 'str'
        }

        self.attribute_map = {
            'model_type': 'modelType',
            'id': 'id',
            'model_name': 'modelName',
            'display_name': 'displayName',
            'namespace_name': 'namespaceName',
            'description': 'description',
            'time_created': 'timeCreated',
            'time_updated': 'timeUpdated',
            'created_by': 'createdBy',
            'updated_by': 'updatedBy',
            'lifecycle_state': 'lifecycleState',
            'lifecycle_details': 'lifecycleDetails',
            'model_capabilities': 'modelCapabilities',
            'model_version': 'modelVersion',
            'vendor': 'vendor',
            'region_id': 'regionId'
        }

        self._model_type = None
        self._id = None
        self._model_name = None
        self._display_name = None
        self._namespace_name = None
        self._description = None
        self._time_created = None
        self._time_updated = None
        self._created_by = None
        self._updated_by = None
        self._lifecycle_state = None
        self._lifecycle_details = None
        self._model_capabilities = None
        self._model_version = None
        self._vendor = None
        self._region_id = None
        self._model_type = 'GEN_AI'

    @property
    def model_capabilities(self):
        """
        Gets the model_capabilities of this AiModel.
        Provides Ai Model's Capabilities.


        :return: The model_capabilities of this AiModel.
        :rtype: list[oci.aidataplatform_dp.models.AiModelCapabilitiesEnum]
        """
        return self._model_capabilities

    @model_capabilities.setter
    def model_capabilities(self, model_capabilities):
        """
        Sets the model_capabilities of this AiModel.
        Provides Ai Model's Capabilities.


        :param model_capabilities: The model_capabilities of this AiModel.
        :type: list[oci.aidataplatform_dp.models.AiModelCapabilitiesEnum]
        """
        self._model_capabilities = model_capabilities

    @property
    def model_version(self):
        """
        Gets the model_version of this AiModel.
        version that is available for that AI Model.


        :return: The model_version of this AiModel.
        :rtype: str
        """
        return self._model_version

    @model_version.setter
    def model_version(self, model_version):
        """
        Sets the model_version of this AiModel.
        version that is available for that AI Model.


        :param model_version: The model_version of this AiModel.
        :type: str
        """
        self._model_version = model_version

    @property
    def vendor(self):
        """
        Gets the vendor of this AiModel.
        vendor name for that Model.


        :return: The vendor of this AiModel.
        :rtype: str
        """
        return self._vendor

    @vendor.setter
    def vendor(self, vendor):
        """
        Sets the vendor of this AiModel.
        vendor name for that Model.


        :param vendor: The vendor of this AiModel.
        :type: str
        """
        self._vendor = vendor

    @property
    def region_id(self):
        """
        Gets the region_id of this AiModel.
        region source of that model


        :return: The region_id of this AiModel.
        :rtype: str
        """
        return self._region_id

    @region_id.setter
    def region_id(self, region_id):
        """
        Sets the region_id of this AiModel.
        region source of that model


        :param region_id: The region_id of this AiModel.
        :type: str
        """
        self._region_id = region_id

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
