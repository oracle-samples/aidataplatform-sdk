# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.


from .table_summary import TableSummary
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class StandardTableSummary(TableSummary):
    """
    Derived model for table summary of a standard catalog.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new StandardTableSummary object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.StandardTableSummary.entity_type` attribute
        of this class is ``STANDARD`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param entity_type:
            The value to assign to the entity_type property of this StandardTableSummary.
            Allowed values for this property are: "ADW", "ALH", "STANDARD", "ATP", "ORACLE", "EXADATA"
        :type entity_type: str

        :param key:
            The value to assign to the key property of this StandardTableSummary.
        :type key: str

        :param display_name:
            The value to assign to the display_name property of this StandardTableSummary.
        :type display_name: str

        :param table_type:
            The value to assign to the table_type property of this StandardTableSummary.
            Allowed values for this property are: "MANAGED", "EXTERNAL"
        :type table_type: str

        :param time_created:
            The value to assign to the time_created property of this StandardTableSummary.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this StandardTableSummary.
        :type time_updated: datetime

        :param created_by:
            The value to assign to the created_by property of this StandardTableSummary.
        :type created_by: str

        :param updated_by:
            The value to assign to the updated_by property of this StandardTableSummary.
        :type updated_by: str

        :param lifecycle_state:
            The value to assign to the lifecycle_state property of this StandardTableSummary.
            Allowed values for this property are: "ACTIVE", "CREATING", "DELETING", "UPDATING"
        :type lifecycle_state: str

        """
        self.swagger_types = {
            'entity_type': 'str',
            'key': 'str',
            'display_name': 'str',
            'table_type': 'str',
            'time_created': 'datetime',
            'time_updated': 'datetime',
            'created_by': 'str',
            'updated_by': 'str',
            'lifecycle_state': 'str'
        }

        self.attribute_map = {
            'entity_type': 'entityType',
            'key': 'key',
            'display_name': 'displayName',
            'table_type': 'tableType',
            'time_created': 'timeCreated',
            'time_updated': 'timeUpdated',
            'created_by': 'createdBy',
            'updated_by': 'updatedBy',
            'lifecycle_state': 'lifecycleState'
        }

        self._entity_type = None
        self._key = None
        self._display_name = None
        self._table_type = None
        self._time_created = None
        self._time_updated = None
        self._created_by = None
        self._updated_by = None
        self._lifecycle_state = None
        self._entity_type = 'STANDARD'

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
