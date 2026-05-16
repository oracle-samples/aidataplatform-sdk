# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class WorkspaceObjectDetails(object):
    """
    A WorkspaceObject is a file or folder belonging to an AI Data Platform Workbench workspace.
    To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized, talk to
    an administrator. If you're an administrator who needs to write policies to give users access, see
    <a href=\"https://docs.oracle.com/en/cloud/paas/ai-data-platform/aidug/iam-policies-oracle-ai-data-platform.html\" target=\"_blank\" rel=\"noopener noreferrer\">IAM Policies for Oracle AI Data Platform Workbench</a>.
    """

    #: A constant which can be used with the type property of a WorkspaceObjectDetails.
    #: This constant has a value of "NOTEBOOK"
    TYPE_NOTEBOOK = "NOTEBOOK"

    #: A constant which can be used with the type property of a WorkspaceObjectDetails.
    #: This constant has a value of "JOB"
    TYPE_JOB = "JOB"

    #: A constant which can be used with the type property of a WorkspaceObjectDetails.
    #: This constant has a value of "LAKE_FLOW"
    TYPE_LAKE_FLOW = "LAKE_FLOW"

    #: A constant which can be used with the type property of a WorkspaceObjectDetails.
    #: This constant has a value of "AGENT_LAKE_FLOW"
    TYPE_AGENT_LAKE_FLOW = "AGENT_LAKE_FLOW"

    #: A constant which can be used with the type property of a WorkspaceObjectDetails.
    #: This constant has a value of "GENERATED_ARTIFACT"
    TYPE_GENERATED_ARTIFACT = "GENERATED_ARTIFACT"

    #: A constant which can be used with the type property of a WorkspaceObjectDetails.
    #: This constant has a value of "LIBRARY"
    TYPE_LIBRARY = "LIBRARY"

    #: A constant which can be used with the type property of a WorkspaceObjectDetails.
    #: This constant has a value of "FILE"
    TYPE_FILE = "FILE"

    #: A constant which can be used with the type property of a WorkspaceObjectDetails.
    #: This constant has a value of "FOLDER"
    TYPE_FOLDER = "FOLDER"

    def __init__(self, **kwargs):
        """
        Initializes a new WorkspaceObjectDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param path:
            The value to assign to the path property of this WorkspaceObjectDetails.
        :type path: str

        :param key:
            The value to assign to the key property of this WorkspaceObjectDetails.
        :type key: str

        :param display_name:
            The value to assign to the display_name property of this WorkspaceObjectDetails.
        :type display_name: str

        :param time_created:
            The value to assign to the time_created property of this WorkspaceObjectDetails.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this WorkspaceObjectDetails.
        :type time_updated: datetime

        :param type:
            The value to assign to the type property of this WorkspaceObjectDetails.
            Allowed values for this property are: "NOTEBOOK", "JOB", "LAKE_FLOW", "AGENT_LAKE_FLOW", "GENERATED_ARTIFACT", "LIBRARY", "FILE", "FOLDER", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type type: str

        :param description:
            The value to assign to the description property of this WorkspaceObjectDetails.
        :type description: str

        :param system_tags:
            The value to assign to the system_tags property of this WorkspaceObjectDetails.
        :type system_tags: dict(str, dict(str, object))

        """
        self.swagger_types = {
            'path': 'str',
            'key': 'str',
            'display_name': 'str',
            'time_created': 'datetime',
            'time_updated': 'datetime',
            'type': 'str',
            'description': 'str',
            'system_tags': 'dict(str, dict(str, object))'
        }

        self.attribute_map = {
            'path': 'path',
            'key': 'key',
            'display_name': 'displayName',
            'time_created': 'timeCreated',
            'time_updated': 'timeUpdated',
            'type': 'type',
            'description': 'description',
            'system_tags': 'systemTags'
        }

        self._path = None
        self._key = None
        self._display_name = None
        self._time_created = None
        self._time_updated = None
        self._type = None
        self._description = None
        self._system_tags = None

    @property
    def path(self):
        """
        **[Required]** Gets the path of this WorkspaceObjectDetails.
        The fully qualified path of the workspace object.
        Example: /Shared/Folder1/Notebook1.ipynb


        :return: The path of this WorkspaceObjectDetails.
        :rtype: str
        """
        return self._path

    @path.setter
    def path(self, path):
        """
        Sets the path of this WorkspaceObjectDetails.
        The fully qualified path of the workspace object.
        Example: /Shared/Folder1/Notebook1.ipynb


        :param path: The path of this WorkspaceObjectDetails.
        :type: str
        """
        self._path = path

    @property
    def key(self):
        """
        Gets the key of this WorkspaceObjectDetails.
        The key of the Workspace Object.


        :return: The key of this WorkspaceObjectDetails.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this WorkspaceObjectDetails.
        The key of the Workspace Object.


        :param key: The key of this WorkspaceObjectDetails.
        :type: str
        """
        self._key = key

    @property
    def display_name(self):
        """
        **[Required]** Gets the display_name of this WorkspaceObjectDetails.
        The name of the Workspace Object. This will be the name of the file/folder in the workspace.
        Example: Notebook1.ipynb, Folder1


        :return: The display_name of this WorkspaceObjectDetails.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this WorkspaceObjectDetails.
        The name of the Workspace Object. This will be the name of the file/folder in the workspace.
        Example: Notebook1.ipynb, Folder1


        :param display_name: The display_name of this WorkspaceObjectDetails.
        :type: str
        """
        self._display_name = display_name

    @property
    def time_created(self):
        """
        **[Required]** Gets the time_created of this WorkspaceObjectDetails.
        The date and time the workspace object was created, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>.
        Example: `2016-08-25T21:10:29.600Z`


        :return: The time_created of this WorkspaceObjectDetails.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this WorkspaceObjectDetails.
        The date and time the workspace object was created, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>.
        Example: `2016-08-25T21:10:29.600Z`


        :param time_created: The time_created of this WorkspaceObjectDetails.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def time_updated(self):
        """
        Gets the time_updated of this WorkspaceObjectDetails.
        The date and time the workspace object was created, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>.
        Example: `2016-08-25T21:10:29.600Z`


        :return: The time_updated of this WorkspaceObjectDetails.
        :rtype: datetime
        """
        return self._time_updated

    @time_updated.setter
    def time_updated(self, time_updated):
        """
        Sets the time_updated of this WorkspaceObjectDetails.
        The date and time the workspace object was created, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>.
        Example: `2016-08-25T21:10:29.600Z`


        :param time_updated: The time_updated of this WorkspaceObjectDetails.
        :type: datetime
        """
        self._time_updated = time_updated

    @property
    def type(self):
        """
        **[Required]** Gets the type of this WorkspaceObjectDetails.
        The type of the workspace object.

        Allowed values for this property are: "NOTEBOOK", "JOB", "LAKE_FLOW", "AGENT_LAKE_FLOW", "GENERATED_ARTIFACT", "LIBRARY", "FILE", "FOLDER", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The type of this WorkspaceObjectDetails.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this WorkspaceObjectDetails.
        The type of the workspace object.


        :param type: The type of this WorkspaceObjectDetails.
        :type: str
        """
        allowed_values = ["NOTEBOOK", "JOB", "LAKE_FLOW", "AGENT_LAKE_FLOW", "GENERATED_ARTIFACT", "LIBRARY", "FILE", "FOLDER"]
        if not value_allowed_none_or_none_sentinel(type, allowed_values):
            type = 'UNKNOWN_ENUM_VALUE'
        self._type = type

    @property
    def description(self):
        """
        Gets the description of this WorkspaceObjectDetails.
        The description for the file and folder.


        :return: The description of this WorkspaceObjectDetails.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this WorkspaceObjectDetails.
        The description for the file and folder.


        :param description: The description of this WorkspaceObjectDetails.
        :type: str
        """
        self._description = description

    @property
    def system_tags(self):
        """
        Gets the system_tags of this WorkspaceObjectDetails.
        System tags for this resource. Each key is predefined and scoped to a namespace.

        Example: `{\"orcl-cloud\": {\"free-tier-retained\": \"true\"}}`


        :return: The system_tags of this WorkspaceObjectDetails.
        :rtype: dict(str, dict(str, object))
        """
        return self._system_tags

    @system_tags.setter
    def system_tags(self, system_tags):
        """
        Sets the system_tags of this WorkspaceObjectDetails.
        System tags for this resource. Each key is predefined and scoped to a namespace.

        Example: `{\"orcl-cloud\": {\"free-tier-retained\": \"true\"}}`


        :param system_tags: The system_tags of this WorkspaceObjectDetails.
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
