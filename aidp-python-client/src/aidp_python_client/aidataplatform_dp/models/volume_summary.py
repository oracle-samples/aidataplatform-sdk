# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class VolumeSummary(object):
    """
    Summary information about a volume.
    """

    #: A constant which can be used with the volume_type property of a VolumeSummary.
    #: This constant has a value of "MANAGED"
    VOLUME_TYPE_MANAGED = "MANAGED"

    #: A constant which can be used with the volume_type property of a VolumeSummary.
    #: This constant has a value of "EXTERNAL"
    VOLUME_TYPE_EXTERNAL = "EXTERNAL"

    def __init__(self, **kwargs):
        """
        Initializes a new VolumeSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this VolumeSummary.
        :type key: str

        :param display_name:
            The value to assign to the display_name property of this VolumeSummary.
        :type display_name: str

        :param description:
            The value to assign to the description property of this VolumeSummary.
        :type description: str

        :param time_created:
            The value to assign to the time_created property of this VolumeSummary.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this VolumeSummary.
        :type time_updated: datetime

        :param created_by:
            The value to assign to the created_by property of this VolumeSummary.
        :type created_by: str

        :param updated_by:
            The value to assign to the updated_by property of this VolumeSummary.
        :type updated_by: str

        :param full_name:
            The value to assign to the full_name property of this VolumeSummary.
        :type full_name: str

        :param volume_type:
            The value to assign to the volume_type property of this VolumeSummary.
            Allowed values for this property are: "MANAGED", "EXTERNAL", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type volume_type: str

        :param lifecycle_state:
            The value to assign to the lifecycle_state property of this VolumeSummary.
        :type lifecycle_state: str

        :param lifecycle_state_details:
            The value to assign to the lifecycle_state_details property of this VolumeSummary.
        :type lifecycle_state_details: str

        :param system_tags:
            The value to assign to the system_tags property of this VolumeSummary.
        :type system_tags: dict(str, dict(str, object))

        """
        self.swagger_types = {
            'key': 'str',
            'display_name': 'str',
            'description': 'str',
            'time_created': 'datetime',
            'time_updated': 'datetime',
            'created_by': 'str',
            'updated_by': 'str',
            'full_name': 'str',
            'volume_type': 'str',
            'lifecycle_state': 'str',
            'lifecycle_state_details': 'str',
            'system_tags': 'dict(str, dict(str, object))'
        }

        self.attribute_map = {
            'key': 'key',
            'display_name': 'displayName',
            'description': 'description',
            'time_created': 'timeCreated',
            'time_updated': 'timeUpdated',
            'created_by': 'createdBy',
            'updated_by': 'updatedBy',
            'full_name': 'fullName',
            'volume_type': 'volumeType',
            'lifecycle_state': 'lifecycleState',
            'lifecycle_state_details': 'lifecycleStateDetails',
            'system_tags': 'systemTags'
        }

        self._key = None
        self._display_name = None
        self._description = None
        self._time_created = None
        self._time_updated = None
        self._created_by = None
        self._updated_by = None
        self._full_name = None
        self._volume_type = None
        self._lifecycle_state = None
        self._lifecycle_state_details = None
        self._system_tags = None

    @property
    def key(self):
        """
        **[Required]** Gets the key of this VolumeSummary.
        The key of the volume.


        :return: The key of this VolumeSummary.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this VolumeSummary.
        The key of the volume.


        :param key: The key of this VolumeSummary.
        :type: str
        """
        self._key = key

    @property
    def display_name(self):
        """
        **[Required]** Gets the display_name of this VolumeSummary.
        A user-friendly name. Has to be unique within the schema and is changeable.


        :return: The display_name of this VolumeSummary.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this VolumeSummary.
        A user-friendly name. Has to be unique within the schema and is changeable.


        :param display_name: The display_name of this VolumeSummary.
        :type: str
        """
        self._display_name = display_name

    @property
    def description(self):
        """
        Gets the description of this VolumeSummary.
        Short description of the volume


        :return: The description of this VolumeSummary.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this VolumeSummary.
        Short description of the volume


        :param description: The description of this VolumeSummary.
        :type: str
        """
        self._description = description

    @property
    def time_created(self):
        """
        **[Required]** Gets the time_created of this VolumeSummary.
        The date and time the Data Lake Volume was created, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>.
        Example: `2016-08-25T21:10:29.600Z`


        :return: The time_created of this VolumeSummary.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this VolumeSummary.
        The date and time the Data Lake Volume was created, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>.
        Example: `2016-08-25T21:10:29.600Z`


        :param time_created: The time_created of this VolumeSummary.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def time_updated(self):
        """
        Gets the time_updated of this VolumeSummary.
        The date and time the Data Lake Volume was updated, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>.
        Example: `2016-08-25T21:10:29.600Z`


        :return: The time_updated of this VolumeSummary.
        :rtype: datetime
        """
        return self._time_updated

    @time_updated.setter
    def time_updated(self, time_updated):
        """
        Sets the time_updated of this VolumeSummary.
        The date and time the Data Lake Volume was updated, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>.
        Example: `2016-08-25T21:10:29.600Z`


        :param time_updated: The time_updated of this VolumeSummary.
        :type: datetime
        """
        self._time_updated = time_updated

    @property
    def created_by(self):
        """
        Gets the created_by of this VolumeSummary.
        The ID of the user that created the volume.


        :return: The created_by of this VolumeSummary.
        :rtype: str
        """
        return self._created_by

    @created_by.setter
    def created_by(self, created_by):
        """
        Sets the created_by of this VolumeSummary.
        The ID of the user that created the volume.


        :param created_by: The created_by of this VolumeSummary.
        :type: str
        """
        self._created_by = created_by

    @property
    def updated_by(self):
        """
        Gets the updated_by of this VolumeSummary.
        The ID of the user that last updated the volume


        :return: The updated_by of this VolumeSummary.
        :rtype: str
        """
        return self._updated_by

    @updated_by.setter
    def updated_by(self, updated_by):
        """
        Sets the updated_by of this VolumeSummary.
        The ID of the user that last updated the volume


        :param updated_by: The updated_by of this VolumeSummary.
        :type: str
        """
        self._updated_by = updated_by

    @property
    def full_name(self):
        """
        Gets the full_name of this VolumeSummary.
        The fully qualified name of this volume.


        :return: The full_name of this VolumeSummary.
        :rtype: str
        """
        return self._full_name

    @full_name.setter
    def full_name(self, full_name):
        """
        Sets the full_name of this VolumeSummary.
        The fully qualified name of this volume.


        :param full_name: The full_name of this VolumeSummary.
        :type: str
        """
        self._full_name = full_name

    @property
    def volume_type(self):
        """
        Gets the volume_type of this VolumeSummary.
        The type of volume.

        Allowed values for this property are: "MANAGED", "EXTERNAL", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The volume_type of this VolumeSummary.
        :rtype: str
        """
        return self._volume_type

    @volume_type.setter
    def volume_type(self, volume_type):
        """
        Sets the volume_type of this VolumeSummary.
        The type of volume.


        :param volume_type: The volume_type of this VolumeSummary.
        :type: str
        """
        allowed_values = ["MANAGED", "EXTERNAL"]
        if not value_allowed_none_or_none_sentinel(volume_type, allowed_values):
            volume_type = 'UNKNOWN_ENUM_VALUE'
        self._volume_type = volume_type

    @property
    def lifecycle_state(self):
        """
        Gets the lifecycle_state of this VolumeSummary.
        The current state of the volume.


        :return: The lifecycle_state of this VolumeSummary.
        :rtype: str
        """
        return self._lifecycle_state

    @lifecycle_state.setter
    def lifecycle_state(self, lifecycle_state):
        """
        Sets the lifecycle_state of this VolumeSummary.
        The current state of the volume.


        :param lifecycle_state: The lifecycle_state of this VolumeSummary.
        :type: str
        """
        self._lifecycle_state = lifecycle_state

    @property
    def lifecycle_state_details(self):
        """
        Gets the lifecycle_state_details of this VolumeSummary.
        Additional details associated with the lifecycle state.


        :return: The lifecycle_state_details of this VolumeSummary.
        :rtype: str
        """
        return self._lifecycle_state_details

    @lifecycle_state_details.setter
    def lifecycle_state_details(self, lifecycle_state_details):
        """
        Sets the lifecycle_state_details of this VolumeSummary.
        Additional details associated with the lifecycle state.


        :param lifecycle_state_details: The lifecycle_state_details of this VolumeSummary.
        :type: str
        """
        self._lifecycle_state_details = lifecycle_state_details

    @property
    def system_tags(self):
        """
        Gets the system_tags of this VolumeSummary.
        System tags for this resource. Each key is predefined and scoped to a namespace.

        Example: `{\"orcl-cloud\": {\"free-tier-retained\": \"true\"}}`


        :return: The system_tags of this VolumeSummary.
        :rtype: dict(str, dict(str, object))
        """
        return self._system_tags

    @system_tags.setter
    def system_tags(self, system_tags):
        """
        Sets the system_tags of this VolumeSummary.
        System tags for this resource. Each key is predefined and scoped to a namespace.

        Example: `{\"orcl-cloud\": {\"free-tier-retained\": \"true\"}}`


        :param system_tags: The system_tags of this VolumeSummary.
        :type: dict(str, dict(str, object))
        """
        self._system_tags = system_tags

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
