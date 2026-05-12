# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.

from .table import Table
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ExadataTable(Table):
    """
    Derived model for table of a Exadata catalog.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ExadataTable object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.ExadataTable.entity_type` attribute
        of this class is ``EXADATA`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param entity_type:
            The value to assign to the entity_type property of this ExadataTable.
            Allowed values for this property are: "ADW", "ALH", "STANDARD", "ATP", "ORACLE", "EXADATA"
        :type entity_type: str

        :param key:
            The value to assign to the key property of this ExadataTable.
        :type key: str

        :param display_name:
            The value to assign to the display_name property of this ExadataTable.
        :type display_name: str

        :param catalog_key:
            The value to assign to the catalog_key property of this ExadataTable.
        :type catalog_key: str

        :param schema_key:
            The value to assign to the schema_key property of this ExadataTable.
        :type schema_key: str

        :param location:
            The value to assign to the location property of this ExadataTable.
        :type location: str

        :param description:
            The value to assign to the description property of this ExadataTable.
        :type description: str

        :param table_type:
            The value to assign to the table_type property of this ExadataTable.
            Allowed values for this property are: "MANAGED", "EXTERNAL"
        :type table_type: str

        :param managed_table_definition:
            The value to assign to the managed_table_definition property of this ExadataTable.
        :type managed_table_definition: oci.aidataplatform_dp.models.ManagedTableDefinition

        :param external_table_definition:
            The value to assign to the external_table_definition property of this ExadataTable.
        :type external_table_definition: oci.aidataplatform_dp.models.ExternalTableDefinition

        :param table_fields:
            The value to assign to the table_fields property of this ExadataTable.
        :type table_fields: list[oci.aidataplatform_dp.models.TableFieldDetails]

        :param partition_keys:
            The value to assign to the partition_keys property of this ExadataTable.
        :type partition_keys: list[oci.aidataplatform_dp.models.TableFieldDetails]

        :param table_properties:
            The value to assign to the table_properties property of this ExadataTable.
        :type table_properties: list[oci.aidataplatform_dp.models.TableProperty]

        :param time_created:
            The value to assign to the time_created property of this ExadataTable.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this ExadataTable.
        :type time_updated: datetime

        :param created_by:
            The value to assign to the created_by property of this ExadataTable.
        :type created_by: str

        :param updated_by:
            The value to assign to the updated_by property of this ExadataTable.
        :type updated_by: str

        :param lifecycle_state:
            The value to assign to the lifecycle_state property of this ExadataTable.
            Allowed values for this property are: "ACTIVE", "CREATING", "DELETING", "UPDATING"
        :type lifecycle_state: str

        :param lifecycle_state_details:
            The value to assign to the lifecycle_state_details property of this ExadataTable.
        :type lifecycle_state_details: str

        """
        self.swagger_types = {
            'entity_type': 'str',
            'key': 'str',
            'display_name': 'str',
            'catalog_key': 'str',
            'schema_key': 'str',
            'location': 'str',
            'description': 'str',
            'table_type': 'str',
            'managed_table_definition': 'ManagedTableDefinition',
            'external_table_definition': 'ExternalTableDefinition',
            'table_fields': 'list[TableFieldDetails]',
            'partition_keys': 'list[TableFieldDetails]',
            'table_properties': 'list[TableProperty]',
            'time_created': 'datetime',
            'time_updated': 'datetime',
            'created_by': 'str',
            'updated_by': 'str',
            'lifecycle_state': 'str',
            'lifecycle_state_details': 'str'
        }

        self.attribute_map = {
            'entity_type': 'entityType',
            'key': 'key',
            'display_name': 'displayName',
            'catalog_key': 'catalogKey',
            'schema_key': 'schemaKey',
            'location': 'location',
            'description': 'description',
            'table_type': 'tableType',
            'managed_table_definition': 'managedTableDefinition',
            'external_table_definition': 'externalTableDefinition',
            'table_fields': 'tableFields',
            'partition_keys': 'partitionKeys',
            'table_properties': 'tableProperties',
            'time_created': 'timeCreated',
            'time_updated': 'timeUpdated',
            'created_by': 'createdBy',
            'updated_by': 'updatedBy',
            'lifecycle_state': 'lifecycleState',
            'lifecycle_state_details': 'lifecycleStateDetails'
        }

        self._entity_type = None
        self._key = None
        self._display_name = None
        self._catalog_key = None
        self._schema_key = None
        self._location = None
        self._description = None
        self._table_type = None
        self._managed_table_definition = None
        self._external_table_definition = None
        self._table_fields = None
        self._partition_keys = None
        self._table_properties = None
        self._time_created = None
        self._time_updated = None
        self._created_by = None
        self._updated_by = None
        self._lifecycle_state = None
        self._lifecycle_state_details = None
        self._entity_type = 'EXADATA'

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
