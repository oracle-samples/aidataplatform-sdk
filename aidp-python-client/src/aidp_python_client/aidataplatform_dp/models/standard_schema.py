# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.


from .schema import Schema
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class StandardSchema(Schema):
    """
    Derived model for schema of a standard catalog.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new StandardSchema object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.StandardSchema.entity_type` attribute
        of this class is ``STANDARD`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param entity_type:
            The value to assign to the entity_type property of this StandardSchema.
            Allowed values for this property are: "ADW", "ALH", "STANDARD", "KAFKA_TOPIC", "ATP", "ORACLE", "EXADATA", "ORACLE_ANALYTICS"
        :type entity_type: str

        :param key:
            The value to assign to the key property of this StandardSchema.
        :type key: str

        :param display_name:
            The value to assign to the display_name property of this StandardSchema.
        :type display_name: str

        :param description:
            The value to assign to the description property of this StandardSchema.
        :type description: str

        :param time_created:
            The value to assign to the time_created property of this StandardSchema.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this StandardSchema.
        :type time_updated: datetime

        :param created_by:
            The value to assign to the created_by property of this StandardSchema.
        :type created_by: str

        :param updated_by:
            The value to assign to the updated_by property of this StandardSchema.
        :type updated_by: str

        :param properties:
            The value to assign to the properties property of this StandardSchema.
        :type properties: dict(str, str)

        :param catalog_name:
            The value to assign to the catalog_name property of this StandardSchema.
        :type catalog_name: str

        :param lifecycle_state:
            The value to assign to the lifecycle_state property of this StandardSchema.
            Allowed values for this property are: "ACTIVE", "CREATING", "DELETING"
        :type lifecycle_state: str

        :param lifecycle_state_details:
            The value to assign to the lifecycle_state_details property of this StandardSchema.
        :type lifecycle_state_details: str

        :param details:
            The value to assign to the details property of this StandardSchema.
        :type details: dict(str, str)

        """
        self.swagger_types = {
            'entity_type': 'str',
            'key': 'str',
            'display_name': 'str',
            'description': 'str',
            'time_created': 'datetime',
            'time_updated': 'datetime',
            'created_by': 'str',
            'updated_by': 'str',
            'properties': 'dict(str, str)',
            'catalog_name': 'str',
            'lifecycle_state': 'str',
            'lifecycle_state_details': 'str',
            'details': 'dict(str, str)'
        }

        self.attribute_map = {
            'entity_type': 'entityType',
            'key': 'key',
            'display_name': 'displayName',
            'description': 'description',
            'time_created': 'timeCreated',
            'time_updated': 'timeUpdated',
            'created_by': 'createdBy',
            'updated_by': 'updatedBy',
            'properties': 'properties',
            'catalog_name': 'catalogName',
            'lifecycle_state': 'lifecycleState',
            'lifecycle_state_details': 'lifecycleStateDetails',
            'details': 'details'
        }

        self._entity_type = None
        self._key = None
        self._display_name = None
        self._description = None
        self._time_created = None
        self._time_updated = None
        self._created_by = None
        self._updated_by = None
        self._properties = None
        self._catalog_name = None
        self._lifecycle_state = None
        self._lifecycle_state_details = None
        self._details = None
        self._entity_type = 'STANDARD'

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
