# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class PublishOntologyProjectDetails(object):
    """
    Details for starting an ontology project publish.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new PublishOntologyProjectDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param workspace_id:
            The value to assign to the workspace_id property of this PublishOntologyProjectDetails.
        :type workspace_id: str

        :param project_name:
            The value to assign to the project_name property of this PublishOntologyProjectDetails.
        :type project_name: str

        :param comment:
            The value to assign to the comment property of this PublishOntologyProjectDetails.
        :type comment: str

        :param target_connection:
            The value to assign to the target_connection property of this PublishOntologyProjectDetails.
        :type target_connection: oci.aidataplatform_dp.models.OntologyPublishTargetConnectionReference

        """
        self.swagger_types = {
            'workspace_id': 'str',
            'project_name': 'str',
            'comment': 'str',
            'target_connection': 'OntologyPublishTargetConnectionReference'
        }

        self.attribute_map = {
            'workspace_id': 'workspaceId',
            'project_name': 'projectName',
            'comment': 'comment',
            'target_connection': 'targetConnection'
        }

        self._workspace_id = None
        self._project_name = None
        self._comment = None
        self._target_connection = None

    @property
    def workspace_id(self):
        """
        Gets the workspace_id of this PublishOntologyProjectDetails.
        Workspace containing the ontology project when publishing by project name.


        :return: The workspace_id of this PublishOntologyProjectDetails.
        :rtype: str
        """
        return self._workspace_id

    @workspace_id.setter
    def workspace_id(self, workspace_id):
        """
        Sets the workspace_id of this PublishOntologyProjectDetails.
        Workspace containing the ontology project when publishing by project name.


        :param workspace_id: The workspace_id of this PublishOntologyProjectDetails.
        :type: str
        """
        self._workspace_id = workspace_id

    @property
    def project_name(self):
        """
        Gets the project_name of this PublishOntologyProjectDetails.
        Ontology project key/name to publish.


        :return: The project_name of this PublishOntologyProjectDetails.
        :rtype: str
        """
        return self._project_name

    @project_name.setter
    def project_name(self, project_name):
        """
        Sets the project_name of this PublishOntologyProjectDetails.
        Ontology project key/name to publish.


        :param project_name: The project_name of this PublishOntologyProjectDetails.
        :type: str
        """
        self._project_name = project_name

    @property
    def comment(self):
        """
        Gets the comment of this PublishOntologyProjectDetails.

        :return: The comment of this PublishOntologyProjectDetails.
        :rtype: str
        """
        return self._comment

    @comment.setter
    def comment(self, comment):
        """
        Sets the comment of this PublishOntologyProjectDetails.

        :param comment: The comment of this PublishOntologyProjectDetails.
        :type: str
        """
        self._comment = comment

    @property
    def target_connection(self):
        """
        Gets the target_connection of this PublishOntologyProjectDetails.

        :return: The target_connection of this PublishOntologyProjectDetails.
        :rtype: oci.aidataplatform_dp.models.OntologyPublishTargetConnectionReference
        """
        return self._target_connection

    @target_connection.setter
    def target_connection(self, target_connection):
        """
        Sets the target_connection of this PublishOntologyProjectDetails.

        :param target_connection: The target_connection of this PublishOntologyProjectDetails.
        :type: oci.aidataplatform_dp.models.OntologyPublishTargetConnectionReference
        """
        self._target_connection = target_connection

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
