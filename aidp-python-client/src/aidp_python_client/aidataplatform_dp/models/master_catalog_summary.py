# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class MasterCatalogSummary(object):
    """
    Summary information about a Master Catalog.
    """

    #: A constant which can be used with the lifecycle_state property of a MasterCatalogSummary.
    #: This constant has a value of "ACTIVE"
    LIFECYCLE_STATE_ACTIVE = "ACTIVE"

    #: A constant which can be used with the lifecycle_state property of a MasterCatalogSummary.
    #: This constant has a value of "CREATING"
    LIFECYCLE_STATE_CREATING = "CREATING"

    #: A constant which can be used with the lifecycle_state property of a MasterCatalogSummary.
    #: This constant has a value of "DELETING"
    LIFECYCLE_STATE_DELETING = "DELETING"

    def __init__(self, **kwargs):
        """
        Initializes a new MasterCatalogSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this MasterCatalogSummary.
        :type key: str

        :param display_name:
            The value to assign to the display_name property of this MasterCatalogSummary.
        :type display_name: str

        :param description:
            The value to assign to the description property of this MasterCatalogSummary.
        :type description: str

        :param lifecycle_state:
            The value to assign to the lifecycle_state property of this MasterCatalogSummary.
            Allowed values for this property are: "ACTIVE", "CREATING", "DELETING"
        :type lifecycle_state: str

        :param lifecycle_state_details:
            The value to assign to the lifecycle_state_details property of this MasterCatalogSummary.
        :type lifecycle_state_details: str

        :param time_created:
            The value to assign to the time_created property of this MasterCatalogSummary.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this MasterCatalogSummary.
        :type time_updated: datetime

        :param created_by:
            The value to assign to the created_by property of this MasterCatalogSummary.
        :type created_by: str

        :param updated_by:
            The value to assign to the updated_by property of this MasterCatalogSummary.
        :type updated_by: str

        """
        self.swagger_types = {
            'key': 'str',
            'display_name': 'str',
            'description': 'str',
            'lifecycle_state': 'str',
            'lifecycle_state_details': 'str',
            'time_created': 'datetime',
            'time_updated': 'datetime',
            'created_by': 'str',
            'updated_by': 'str'
        }

        self.attribute_map = {
            'key': 'key',
            'display_name': 'displayName',
            'description': 'description',
            'lifecycle_state': 'lifecycleState',
            'lifecycle_state_details': 'lifecycleStateDetails',
            'time_created': 'timeCreated',
            'time_updated': 'timeUpdated',
            'created_by': 'createdBy',
            'updated_by': 'updatedBy'
        }

        self._key = None
        self._display_name = None
        self._description = None
        self._lifecycle_state = None
        self._lifecycle_state_details = None
        self._time_created = None
        self._time_updated = None
        self._created_by = None
        self._updated_by = None

    @property
    def key(self):
        """
        **[Required]** Gets the key of this MasterCatalogSummary.
        The key of the Data Lake Master Catalog.


        :return: The key of this MasterCatalogSummary.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this MasterCatalogSummary.
        The key of the Data Lake Master Catalog.


        :param key: The key of this MasterCatalogSummary.
        :type: str
        """
        self._key = key

    @property
    def display_name(self):
        """
        **[Required]** Gets the display_name of this MasterCatalogSummary.
        A user-friendly name. Has to be unique and it's changeable.


        :return: The display_name of this MasterCatalogSummary.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this MasterCatalogSummary.
        A user-friendly name. Has to be unique and it's changeable.


        :param display_name: The display_name of this MasterCatalogSummary.
        :type: str
        """
        self._display_name = display_name

    @property
    def description(self):
        """
        Gets the description of this MasterCatalogSummary.
        Short description of the catalog


        :return: The description of this MasterCatalogSummary.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this MasterCatalogSummary.
        Short description of the catalog


        :param description: The description of this MasterCatalogSummary.
        :type: str
        """
        self._description = description

    @property
    def lifecycle_state(self):
        """
        Gets the lifecycle_state of this MasterCatalogSummary.
        The state of the Catalog.

        Allowed values for this property are: "ACTIVE", "CREATING", "DELETING"


        :return: The lifecycle_state of this MasterCatalogSummary.
        :rtype: str
        """
        return self._lifecycle_state

    @lifecycle_state.setter
    def lifecycle_state(self, lifecycle_state):
        """
        Sets the lifecycle_state of this MasterCatalogSummary.
        The state of the Catalog.


        :param lifecycle_state: The lifecycle_state of this MasterCatalogSummary.
        :type: str
        """
        allowed_values = ["ACTIVE", "CREATING", "DELETING"]
        if not value_allowed_none_or_none_sentinel(lifecycle_state, allowed_values):
            raise ValueError(
                "Invalid value for `lifecycle_state`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._lifecycle_state = lifecycle_state

    @property
    def lifecycle_state_details(self):
        """
        Gets the lifecycle_state_details of this MasterCatalogSummary.
        A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state.


        :return: The lifecycle_state_details of this MasterCatalogSummary.
        :rtype: str
        """
        return self._lifecycle_state_details

    @lifecycle_state_details.setter
    def lifecycle_state_details(self, lifecycle_state_details):
        """
        Sets the lifecycle_state_details of this MasterCatalogSummary.
        A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state.


        :param lifecycle_state_details: The lifecycle_state_details of this MasterCatalogSummary.
        :type: str
        """
        self._lifecycle_state_details = lifecycle_state_details

    @property
    def time_created(self):
        """
        **[Required]** Gets the time_created of this MasterCatalogSummary.
        The date and time the Data Lake Master Catalog was created, in the format defined by `RFC 3339`__.
        Example: `2016-08-25T21:10:29.600Z`

        __ https://tools.ietf.org/html/rfc3339


        :return: The time_created of this MasterCatalogSummary.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this MasterCatalogSummary.
        The date and time the Data Lake Master Catalog was created, in the format defined by `RFC 3339`__.
        Example: `2016-08-25T21:10:29.600Z`

        __ https://tools.ietf.org/html/rfc3339


        :param time_created: The time_created of this MasterCatalogSummary.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def time_updated(self):
        """
        Gets the time_updated of this MasterCatalogSummary.
        The date and time the Data Lake Master Catalog was updated, in the format defined by `RFC 3339`__.
        Example: `2016-08-25T21:10:29.600Z`

        __ https://tools.ietf.org/html/rfc3339


        :return: The time_updated of this MasterCatalogSummary.
        :rtype: datetime
        """
        return self._time_updated

    @time_updated.setter
    def time_updated(self, time_updated):
        """
        Sets the time_updated of this MasterCatalogSummary.
        The date and time the Data Lake Master Catalog was updated, in the format defined by `RFC 3339`__.
        Example: `2016-08-25T21:10:29.600Z`

        __ https://tools.ietf.org/html/rfc3339


        :param time_updated: The time_updated of this MasterCatalogSummary.
        :type: datetime
        """
        self._time_updated = time_updated

    @property
    def created_by(self):
        """
        Gets the created_by of this MasterCatalogSummary.
        The userId which created the catalog.


        :return: The created_by of this MasterCatalogSummary.
        :rtype: str
        """
        return self._created_by

    @created_by.setter
    def created_by(self, created_by):
        """
        Sets the created_by of this MasterCatalogSummary.
        The userId which created the catalog.


        :param created_by: The created_by of this MasterCatalogSummary.
        :type: str
        """
        self._created_by = created_by

    @property
    def updated_by(self):
        """
        Gets the updated_by of this MasterCatalogSummary.
        The userId which last updated the catalog


        :return: The updated_by of this MasterCatalogSummary.
        :rtype: str
        """
        return self._updated_by

    @updated_by.setter
    def updated_by(self, updated_by):
        """
        Sets the updated_by of this MasterCatalogSummary.
        The userId which last updated the catalog


        :param updated_by: The updated_by of this MasterCatalogSummary.
        :type: str
        """
        self._updated_by = updated_by

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
